import java.util.Objects;

public class Pair {
private String before;
private String after;

    public Pair(String before, String after) {
        this.before = before;
        this.after = after;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(before, pair.before) && Objects.equals(after, pair.after);
    }

    @Override
    public int hashCode() {
        return Objects.hash(before, after);
    }
}
