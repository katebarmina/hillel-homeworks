package homework15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class GameService {

    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");

    public void pickSign(Player player){
        System.out.println("Pick one of the hand signs:\n-Paper\n-Rock\n-Scissors");
        System.out.println("Write the first letter of the picked hand sign.");
        System.out.println("To quit write X.");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        switch (letter.toUpperCase(Locale.ROOT)) {
            case "P" -> {
                player.setHandSign(HandSign.PAPER);
                loggerDebug.debug("The player chose paper");
            }
            case "R" -> {
                player.setHandSign(HandSign.ROCK);
                loggerDebug.debug("The player chose rock");
            }
            case "S" -> {
                player.setHandSign(HandSign.SCISSORS);
                loggerDebug.debug("The player chose scissors");
            }
            case "X" -> {
                System.out.println(printResults(player));
                loggerDebug.debug("The player quited the game.");
                System.exit(1);
            }
            default -> {
                System.out.println("There isn't such hand sign.");
                loggerDebug.debug("The player has entered incorrect value");
                pickSign(player);
            }
        }

    }

    public HandSign computersTurn() {
        int randomSign = new Random().nextInt(HandSign.values().length);
        System.out.println("Computer's turn:" + HandSign.values()[randomSign]);
        loggerDebug.debug("Computer chose " + HandSign.values()[randomSign]);
        return HandSign.values()[randomSign];
    }

    public void chooseWinner(HandSign playersSign, HandSign computerSign, Player player) {
        player.setPlayedGames(player.getPlayedGames() + 1);
        char[][] defineWinner = {{'D', 'C', 'P'},
                {'P', 'D', 'C'},
                {'C', 'P', 'D'}};
        char winner = defineWinner[playersSign.getValue()][computerSign.getValue()];
        switch (winner) {
            case 'D' -> {
                System.out.println("Draw");
                loggerDebug.debug("Result of the game: draw");
            }
            case 'C' -> {
                System.out.println("Computer won.");
                loggerDebug.debug("Result of the game: computer won");
                player.setLostGames(player.getLostGames() + 1);
            }
            case 'P' -> {
                System.out.println("Congratulations,you won!");
                loggerDebug.debug("Result of the game: the player won");
                player.setWonGames(player.getWonGames() + 1);
            }
        }
    }

    String printResults(Player player) {
        int numOfDraws = player.getPlayedGames() - (player.getWonGames() + player.getLostGames());
        loggerResult.debug("===============================================");
        loggerResult.debug("Game statistic for the player: " + player.getName());
        loggerResult.debug("Total games played :" + player.getPlayedGames());
        loggerResult.debug("Lost games: " + player.getLostGames());
        loggerResult.debug("Draw :" + numOfDraws);
        loggerResult.debug("Won games: " + player.getWonGames());
        loggerResult.debug("===============================================");
        return "\nTotal games played :" + player.getPlayedGames() +
                "\nLost games: " + player.getLostGames() +
                "\nWon games: " + player.getWonGames() + "\nDraw :" + numOfDraws + "\n";
    }
}

