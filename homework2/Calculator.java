import java.util.Scanner;

class Calculator {
    static double findArithmeticMeanOfTwoNumbers(double number1, double number2) {
        return (number1 + number2) / 2;
    }

    static double findArithmeticMeanOfSeveralNumbers(int amountOfNumbers) {
        double sum = 0;
        for (int i = 1; i < amountOfNumbers + 1; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + i + " number: ");
            double number = scanner.nextDouble();
            sum += number;
        }
        return sum / amountOfNumbers;
    }

    public static void main(String[] args) {
        System.out.println(findArithmeticMeanOfTwoNumbers(9,10));
        System.out.println(findArithmeticMeanOfSeveralNumbers(3));
    }


}
