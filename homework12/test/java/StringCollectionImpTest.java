
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class StringCollectionImpTest {
    private final StringCollection collection = new StringCollectionImp();

    @Test
    public void testAdd() {
        collection.add("2");
        Assertions.assertEquals(1, collection.size());
    }

    @Test
    public void testAddByIndex() {
        collection.add("3");
        collection.add(0, "4");
        Assertions.assertEquals("4", collection.get(0));
        Assertions.assertEquals(2, collection.size());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> collection.add(9, "23"));

    }

    @Test
    public void testDelete() {
        collection.add("1");
        collection.delete("1");
        Assertions.assertEquals(0, collection.size());
    }

    @Test
    public void testGet() {
        collection.add("3");
        Assertions.assertEquals("3", collection.get(0));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> collection.get(-7));

    }

    @Test
    public void testContain() {
        collection.add("1");
        Assertions.assertTrue(collection.contain("1"));
        Assertions.assertFalse(collection.contain("32"));
    }

    @Test
    public void testEquals() {
        collection.add("3");
        collection.add("4");
        List<String> list = Arrays.asList("3","4");
        Assertions.assertTrue( collection.equals(list));
        collection.add(1, "24");
        Assertions.assertFalse( collection.equals(list));
    }

    @Test
    public void testClear() {
        collection.add("1");
        collection.clear();
        Assertions.assertEquals(0, collection.size());
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(0, collection.size());

        collection.add("2");
        Assertions.assertEquals(1, collection.size());

        collection.delete("2");
        Assertions.assertEquals(0, collection.size());

    }
}