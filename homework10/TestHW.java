import java.util.*;

public class TestHW {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(Arrays.asList("John", "Peter", "John", "Sarah", "Peter", "Jack"));
        System.out.println(arrayList);
        arrayList = (ArrayList) removeDuplicates(arrayList);
        System.out.println(arrayList);


        CustomCollectionImp myCollection = new CustomCollectionImp();
        myCollection.add("2");
        myCollection.add("7");
        myCollection.add("23");
        myCollection.add("98");
        myCollection.add("223");
        Iterator it = myCollection.iterator();
        it.forEachRemaining(System.out::println);
        Iterator it2 = myCollection.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

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
