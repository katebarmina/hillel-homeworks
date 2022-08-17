package homework17;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileConverter {

  private static final List<String> fileConversionInfo = new ArrayList<>();

  private static List<String> getListOfValidatedFiles(List<String> files, String extension)
      throws IOException {
    List<String> listOfValidatedFiles = new ArrayList<>();
    for (String s : files) {
      if (extension.equals(".json")) {
        validateJsonFile(s);
      } else {
        validateYAMLFile(s);
      }
      listOfValidatedFiles.add(new String(Files.readAllBytes(Paths.get(s))));
    }
    return listOfValidatedFiles;
  }

  private static void validateJsonFile(String jsonFile) {
    JSONParser parser = new JSONParser();
    try (FileReader fileReader = new FileReader(jsonFile)) {
      parser.parse(fileReader);
    } catch (IOException | ParseException exception) {
      System.out.println("Not a json file");
    }
  }

  private static void validateYAMLFile(String YAMLFile) {
    if (!new File(YAMLFile).getName().endsWith(".yaml")) {
      System.out.println("Not a yaml file");
    }
  }

  public void convertFile(String pathString) throws IOException {
    Path path = Path.of(pathString);
    if (Files.isDirectory(path)) {
      List<String> files;
      files = getAllFilesWithExtension(".yaml", path);
      convertYamlToJson(files);
      files = getAllFilesWithExtension(".json", path);
      convertJsonToYaml(files);
      saveResults();
    }
  }

  private void convertJsonToYaml(List<String> jsonFiles) {
    try {
      long start = System.currentTimeMillis();
      long end = 0;
      List<String> listOfValidatedFiles = getListOfValidatedFiles(jsonFiles, ".json");
      Gson gson = new Gson();
      Yaml yaml = new Yaml();
      for (String filePath : jsonFiles) {
        File file = new File(filePath);
        String newName = file.getName().replace(".json", ".yaml");
        for (String jsonString : listOfValidatedFiles) {
          Map<String, Object>[] map = gson.fromJson(jsonString, Map[].class);
          yaml.load(jsonString);
          File dir = new File(System.getProperty("user.dir")+"\\converted");
          if (!dir.exists()){
            dir.mkdirs();
          }
          PrintWriter writer =
              new PrintWriter(
                  System.getProperty("user.dir")+"\\converted\\" + newName);
          yaml.dump(map, writer);
          end = System.currentTimeMillis();
          System.out.println("File was successfully converted from JSON to YAML");
        }
        long time = end - start;
        fileConversionInfo.add(
            "\n"
                + file.getName()
                + " -> "
                + newName
                + "\nTime of conversion:"
                + time
                + "\nSize: "
                + Files.size(Path.of(filePath))
                + " -> "
                + Files.size(
                    Path.of(
                            System.getProperty("user.dir")+"\\converted\\"
                            + newName)));
      }
    } catch (IOException exception) {
      fileConversionInfo.add("File wasn't converted");
      System.out.println("File wasn't converted");
    }
  }

  private void convertYamlToJson(List<String> files){
    try {
      long start = System.currentTimeMillis();
      long end = 0;
      List<String> list = getListOfValidatedFiles(files, ".yaml");
      for (String filePath : files) {
        File file = new File(filePath);
        String newName = file.getName().replace(".yaml", ".json");
        for (String yamlString : list) {
          ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
          Object obj = yamlReader.readValue(yamlString, Object.class);
          ObjectMapper jsonWriter = new ObjectMapper();
          File dir = new File(System.getProperty("user.dir")+"\\converted");
          if (!dir.exists()){
            dir.mkdirs();
          }
          jsonWriter.writeValue(
              new File(
                      System.getProperty("user.dir")+"\\converted\\" + newName),
              obj);
          end = System.currentTimeMillis();
          System.out.println("File was successfully converted from YAML to JSON");
        }
        long time = end - start;
        fileConversionInfo.add(
            "\n"
                + file.getName()
                + " -> "
                + newName
                + "\nTime of conversion:"
                + time
                + "\nSize: "
                + Files.size(Path.of(filePath))
                + " -> "
                + Files.size(
                    Path.of(
                            System.getProperty("user.dir")+"\\converted\\"
                            + newName)));
      }
    } catch (IOException ex) {
      fileConversionInfo.add("File wasn't converted");
      System.out.println("File wasn't converted");
    }
  }

  private List<String> getAllFilesWithExtension(String extension, Path path) throws IOException {

    return Files.list(path)
        .map(Path::toString)
        .filter(e -> e.endsWith(extension))
        .collect(Collectors.toList());
  }

  private void saveResults() throws IOException {
    Path path = Paths.get(System.getProperty("user.dir"));
    String fileName = "result.log";
    File file = new File(path.toString(), fileName);
    FileOutputStream fileOutputStream = null;
    StringBuilder res = new StringBuilder();
    try {
      if (file.exists()) {
        fileOutputStream = new FileOutputStream(file, true);
        for (String str : fileConversionInfo) {
          res.append(str).append("\n");
        }
        byte[] results = res.toString().getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(results);
      } else {
        file.createNewFile();
        fileOutputStream = new FileOutputStream(file);
        for (String str : fileConversionInfo) {
          res.append(str).append("\n");
        }
        byte[] results = res.toString().getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(results);
      }
    } catch (IOException ex) {
      System.out.println("Couldn't save results");
    } finally {
      if (fileOutputStream != null) {
        fileOutputStream.close();
      }
    }
  }
}
