package homework15;

public class Player {
    private String name;
    private HandSign handSign;
    private int lostGames;
    private int wonGames;
    private int playedGames;

    public Player(String name) {
        this.name = name;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HandSign getHandSign() {
        return handSign;
    }

    public void setHandSign(HandSign handSign) {
        this.handSign = handSign;
    }

    public int getLostGames() {
        return lostGames;
    }

    public void setLostGames(int lostGames) {
        this.lostGames = lostGames;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
    }

    @Override
    public String toString() {
        return "homework15.Player{" +
                "name='" + name + '\'' +
                ", handSign=" + handSign +
                ", lostGames=" + lostGames +
                ", wonGames=" + wonGames +
                ", playedGames=" + playedGames +
                '}';
    }
}
