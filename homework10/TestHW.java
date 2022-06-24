import java.util.*;

public class TestHW {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(Arrays.asList("John", "Peter", "John", "Sarah", "Peter", "Jack"));
        System.out.println(arrayList);
        arrayList = (ArrayList) removeDuplicates(arrayList);
        System.out.println(arrayList);


        StringCollectionImp myArrayList = new StringCollectionImp();
        myArrayList.add("23");
        myArrayList.add("3");
        myArrayList.add("0");
        myArrayList.add("12");
        myArrayList.delete("23");
        Iterator iterator = myArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");
        Iterator iterator2 = myArrayList.iterator();
        iterator2.forEachRemaining(System.out::println);

        QCalculator qCalculator = new QCalculator();
        qCalculator.calcQuadraticEquation(1, -2, -3);
    }


    public static Collection removeDuplicates(Collection collection){
        Set set = new HashSet(collection);
        collection.clear();
        collection.addAll(set);
        return collection;
    }

}
