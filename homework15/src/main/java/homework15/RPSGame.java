package homework15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;

public class RPSGame {

    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");

    public void startGame() throws IOException {
        GameService gameService = new GameService();
        loggerDebug.debug("A player started the game");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next());
        System.out.println("How many games do you want to play?");
        int numOfGames = scanner.nextInt();
        loggerDebug.debug("The player decided to play " + numOfGames + " games");
        int playedGames = 0;
        while (playedGames < numOfGames) {
            gameService.pickSign(player);
            HandSign computersSign = gameService.computersTurn();
            gameService.chooseWinner(player.getHandSign(), computersSign, player);
            playedGames++;
            loggerDebug.debug("Played games: " + playedGames);
            loggerDebug.debug("Left games: " + (numOfGames - playedGames));
        }
        System.out.println(gameService.printResults(player));
        loggerDebug.debug("The player quited the game");
    }
}
