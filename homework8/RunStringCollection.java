import java.util.ArrayList;

public class RunStringCollection {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollectionImp();
        stringCollection.add("5");
        stringCollection.add("11");
        stringCollection.add("87");
        stringCollection.add("34");
        stringCollection.add("23");
        stringCollection.add("16");
        stringCollection.add("45");
        stringCollection.add("65");
        stringCollection.add("98");
        stringCollection.add("0");
        System.out.println(stringCollection);
        System.out.println(stringCollection.contain("45"));
        System.out.println(stringCollection.get(3));
        ArrayList arrayList = new ArrayList();
        arrayList.add("5");
        arrayList.add("11");
        arrayList.add("87");
        arrayList.add("34");
        arrayList.add("23");
        arrayList.add("16");
        arrayList.add("45");
        arrayList.add("65");
        arrayList.add("98");
        arrayList.add("0");
        System.out.println(stringCollection.equals(arrayList));
        stringCollection.add(2, "99");
        System.out.println(stringCollection);
        stringCollection.delete("45");
        System.out.println(stringCollection);
        System.out.println(stringCollection.size());
        stringCollection.clear();
        System.out.println(stringCollection.size());

    }
}
