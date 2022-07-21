package hm14;

public class TestHM14 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        try {
            printer.printSequenceOfNumbers("079");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Argument of the program is null.");
        }

    }
}
