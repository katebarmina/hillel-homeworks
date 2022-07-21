package hm14;

public class NumberPrinter {
    private final NumberLibrary numberLibrary = new NumberLibrary();

    private boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void printSequenceOfNumbers(String args){
        String[] sequenceOfNum = args.split("");
        for (String s : sequenceOfNum) {
            if (isNumber(s)) {
                switch (s) {
                    case "0":
                        numberLibrary.printZero();
                        break;
                    case "1":
                        numberLibrary.printOne();
                        break;
                    case "2":
                        numberLibrary.printTwo();
                        break;
                    case "3":
                        numberLibrary.printThree();
                        break;
                    case "4":
                        numberLibrary.printFour();
                        break;
                    case "5":
                        numberLibrary.printFive();
                        break;
                    case "6":
                        numberLibrary.printSix();
                        break;
                    case "7":
                        numberLibrary.printSeven();
                        break;
                    case "8":
                        numberLibrary.printEight();
                        break;
                    case "9":
                        numberLibrary.printNine();
                        break;
                }
            }
        }
    }
}
