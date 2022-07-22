package homework15;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GameService {

    public void pickSign(Player player) {
        System.out.println("Pick one of the hand signs:\n-Paper\n-Rock\n-Scissors");
        System.out.println("Write the first letter of the picked hand sign.");
        System.out.println("To quit write X.");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        switch (letter.toUpperCase(Locale.ROOT)) {
            case "P":
                player.setHandSign(HandSign.PAPER);
                break;
            case "R":
                player.setHandSign(HandSign.ROCK);
                break;
            case "S":
                player.setHandSign(HandSign.SCISSORS);
                break;
            case "X":
                printResults(player);
                System.exit(1);
            default:
                System.out.println("There isn't such hand sign.");
                pickSign(player);
        }

    }

    public HandSign computersTurn() {
        int randomSign = new Random().nextInt(HandSign.values().length);
        System.out.println("Computer's turn:" + HandSign.values()[randomSign]);
        return HandSign.values()[randomSign];
    }

    public void chooseWinner(HandSign playersSign, HandSign computerSign, Player player) {
        player.setPlayedGames(player.getPlayedGames() + 1);
        char defineWinner[][] = {{'D', 'C', 'P'},
                {'P', 'D', 'C'},
                {'C', 'P', 'D'}};
        char winner = defineWinner[playersSign.getValue()][computerSign.getValue()];
        switch (winner) {
            case 'D':
                System.out.println("Draw");
                break;
            case 'C':
                System.out.println("Computer won.");
                player.setLostGames(player.getLostGames() + 1);
                break;
            case 'P':
                System.out.println("Congratulations,you won!");
                player.setWonGames(player.getWonGames() + 1);
                break;
        }
    }

    void printResults(Player player) {
        System.out.println("Total games played :" + player.getPlayedGames());
        System.out.println("Lost games: " + player.getLostGames());
        System.out.println("Won games: " + player.getWonGames());
    }

}

