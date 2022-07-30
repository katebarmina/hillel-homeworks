package homework17;

import java.io.IOException;

public class RunFileConverter {
  public static void main(String[] args) throws IOException {
    FileConverter fileConverter = new FileConverter();
    if (args.length != 0) {
      fileConverter.convertFile(args[0]);
    } else {
      fileConverter.convertFile(System.getProperty("user.dir"));
    }
  }
}
