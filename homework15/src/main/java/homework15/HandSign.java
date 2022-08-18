package homework15;

public enum HandSign {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private final int value;

    HandSign(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
