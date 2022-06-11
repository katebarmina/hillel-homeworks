
public class RunStringArr {
    public static void main(String[] args) {
        StringArray array = new StringArrayImp();
        array.add("3");
        array.add("2");
        array.add("6");
        array.add("4");
        array.add("5");
        array.add("9");
        array.add("11");
        array.add("19");
        array.add("21");
        array.add("8");
        System.out.println(array);
        array.add(3,"13");
        System.out.println(array);
        array.delete(5);
        System.out.println(array);
        array.delete("19");
        System.out.println(array);
        System.out.println(array.get(1));
    }
}
