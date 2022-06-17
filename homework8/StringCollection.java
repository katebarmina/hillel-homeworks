import java.util.Collection;

public interface StringCollection {
    boolean add(String o);

    boolean add(int index, String o);

    boolean delete (String o);

    String get(int index);

    boolean contain(String o);

    boolean equals (Collection str);

    boolean clear();

    int size();
}
