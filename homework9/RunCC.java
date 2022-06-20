
import java.util.LinkedList;
import java.util.List;

public class RunCC {
    public static void main(String[] args) {
        CustomCollection customCollection = new CustomCollectionImp();
        List<String> linkedList = new LinkedList();
        linkedList.add("41");
        linkedList.add("34");
        customCollection.add("4");
        customCollection.add("9");
        customCollection.add("12");
        customCollection.add("98");
        customCollection.add("23");
        System.out.println(customCollection);
        customCollection.delete(4);
        System.out.println("---------------");
        System.out.println(customCollection);
        customCollection.delete("12");
        System.out.println("----------------");
        System.out.println(customCollection);
        System.out.println("----------------");
        customCollection.addAll(linkedList);
        System.out.println(customCollection);
        System.out.println("---------------");
        System.out.println(customCollection.size());
        customCollection.clear();
        System.out.println(customCollection.size());

    }
}
