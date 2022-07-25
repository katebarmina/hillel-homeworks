package homework15;

import java.io.IOException;
import java.util.Scanner;

public class RPSGame {


    public void startGame() throws IOException {
        GameService gameService = new GameService();
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next());
        System.out.println("How many games do you want to play?");
        int numOfGames = scanner.nextInt();
        int playedGames = 0;
        while (playedGames < numOfGames) {
            gameService.pickSign(player);
            HandSign computersSign = gameService.computersTurn();
            gameService.chooseWinner(player.getHandSign(), computersSign, player);
            playedGames++;
        }
        System.out.println(gameService.printResults(player));
        gameService.saveGame(player);
    }
}
