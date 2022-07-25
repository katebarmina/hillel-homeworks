package homework15;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class GameService {

    private final List<String> courseOfTheGame = new ArrayList<>();

    public void pickSign(Player player) throws IOException {
        System.out.println("Pick one of the hand signs:\n-Paper\n-Rock\n-Scissors");
        System.out.println("Write the first letter of the picked hand sign.");
        System.out.println("To quit write X.");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        switch (letter.toUpperCase(Locale.ROOT)) {
            case "P":
                player.setHandSign(HandSign.PAPER);
                courseOfTheGame.add("Player :" + HandSign.PAPER);
                break;
            case "R":
                player.setHandSign(HandSign.ROCK);
                courseOfTheGame.add("Player :" + HandSign.ROCK);
                break;
            case "S":
                player.setHandSign(HandSign.SCISSORS);
                courseOfTheGame.add("Player :" + HandSign.SCISSORS);
                break;
            case "X":
                System.out.println(printResults(player));
                saveGame(player);
                System.exit(1);
            default:
                System.out.println("There isn't such hand sign.");
                pickSign(player);
        }

    }

    public HandSign computersTurn() {
        int randomSign = new Random().nextInt(HandSign.values().length);
        System.out.println("Computer's turn:" + HandSign.values()[randomSign]);
        courseOfTheGame.add("Computer: " + HandSign.values()[randomSign]);
        return HandSign.values()[randomSign];
    }

    public void chooseWinner(HandSign playersSign, HandSign computerSign, Player player) {
        player.setPlayedGames(player.getPlayedGames() + 1);
        char[][] defineWinner = {{'D', 'C', 'P'},
                {'P', 'D', 'C'},
                {'C', 'P', 'D'}};
        char winner = defineWinner[playersSign.getValue()][computerSign.getValue()];
        switch (winner) {
            case 'D':
                System.out.println("Draw");
                courseOfTheGame.add("Result: Draw");
                break;
            case 'C':
                System.out.println("Computer won.");
                courseOfTheGame.add("Result: Computer won");
                player.setLostGames(player.getLostGames() + 1);
                break;
            case 'P':
                System.out.println("Congratulations,you won!");
                courseOfTheGame.add("Result: Player won");
                player.setWonGames(player.getWonGames() + 1);
                break;
        }
    }

    String printResults(Player player) {
        int numOfDraws = player.getPlayedGames() - (player.getWonGames() + player.getLostGames());
        return "\nTotal games played :" + player.getPlayedGames() +
                "\nLost games: " + player.getLostGames() +
                "\nWon games: " + player.getWonGames() + "\nDraw :" + numOfDraws + "\n";
    }

    void saveGame(Player player) throws IOException {
        Path path = Paths.get("RunGame.java").toAbsolutePath().getParent();
        String fileName = "gameInfo.log";
        File file = new File(path.toString(),fileName);
        FileOutputStream fileOutputStream;
        StringBuilder res = new StringBuilder();
        if (file.exists()) {
            fileOutputStream = new FileOutputStream(file, true);
            for (String str : courseOfTheGame) {
                res.append(str).append("\n");
            }
            res.append(printResults(player));
            byte[] results = res.toString().getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(results);
        } else {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);

            for (String str : courseOfTheGame) {
                res.append(str).append("\n");
            }
            res.append(printResults(player));
            byte[] results = res.toString().getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(results);
        }
        fileOutputStream.close();
    }
}

