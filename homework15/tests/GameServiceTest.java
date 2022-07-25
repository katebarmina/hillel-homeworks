import homework15.GameService;
import homework15.HandSign;
import homework15.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GameServiceTest {

    private final GameService gameService = new GameService();

    @Test
    void chooseWinner() {
        Player player = new Player("Kate");
        player.setHandSign(HandSign.ROCK);
        gameService.chooseWinner(player.getHandSign(),HandSign.SCISSORS,player);
        player.setHandSign(HandSign.SCISSORS);
        gameService.chooseWinner(player.getHandSign(), HandSign.ROCK,player);
        Assertions.assertTrue(player.getWonGames() == 1 && player.getPlayedGames() == 2 && player.getLostGames()==1);
    }
}