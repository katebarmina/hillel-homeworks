
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        printOddNumbersFrom1to99();
        calculateFactorialOfN(5);
        rewriteTask1And2UsingWhile(5);
        rewriteTask1And2UsingDoWhile(5);
        calculatePow(2, 3);
        printSequence();
        printMultiplicationTable(9);
        printArray();
        findTheSmallestElement(10);
        findTheBiggestElement(10);
        swapElements(10);
        printChessboard();
    }

    private static void printOddNumbersFrom1to99() {
        System.out.println("Print odd numbers from 1 to 99");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private static void calculateFactorialOfN(int n) {
        System.out.println("Print factorial of " + n);
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println("Factorial of " + n + " is " + res);
    }

    private static void rewriteTask1And2UsingWhile(int n) {
        System.out.println("Rewrite task 1 and 2 using while loop");
        System.out.println("Task 1");
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("Task 2");
        i = 1;
        int res = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + res);
    }

    private static void rewriteTask1And2UsingDoWhile(int n) {
        System.out.println("Rewrite task 1 and 2 using do-while loop");
        System.out.println("Task 1");
        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        } while (i < 100);

        System.out.println("Task 2");
        i = 1;
        int res = 1;
        do {
            res *= i;
            i++;
        } while (i <= n);
        System.out.println("Factorial of " + n + " is " + res);
    }

    private static void calculatePow(int x, int n) {
        System.out.println("Calculate pow of "+ x);
        int res = (int) Math.pow(x, n);
        System.out.println(x + "^" + n + "=" + res);
    }

    private static void printSequence() {
        System.out.println("Print 10 numbers of sequence : 0, -5 , -10 ..");
        int number = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(number);
            number -= 5;
        }
    }

    private static void printMultiplicationTable(int x) {
        System.out.println("Print multiplication table of " + x);
        if (x > 10 || x < 0) {
            throw new IllegalArgumentException("x must be less than 10 and greater than 0.");
        }
        for (int i = 1; i < 11; i++) {
            int res = x * i;
            System.out.println(x + "*" + i + " = " + res);
        }
    }

    private static void printArray() {
        System.out.println("Print array with commas");
        int arr[] = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length * 2; i++) {
            if (i % 2 != 0) {
                arr[count] = i;
                if (count == 0) {
                    System.out.print(arr[count++]);
                    continue;
                }
                System.out.print("," + arr[count++]);

            }

        }
    }

    private static int[] createAndFillArray(int n) {
        int arr[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }

    private static void findTheSmallestElement(int n) {
        System.out.println("\nFind the smallest element");
        int arr[] = createAndFillArray(n);
        Arrays.sort(arr);
        System.out.println("The smallest element is: " + arr[0]);
    }

    private static void findTheBiggestElement(int n) {
        System.out.println("Find the biggest element");
        int arr[] = createAndFillArray(n);
        Arrays.sort(arr);
        System.out.println("The biggest element is: " + arr[arr.length - 1]);


    }

    private static void swapElements(int n) {
        System.out.println("Swap the biggest and the smallest element");
        int arr[] = createAndFillArray(n);
        System.out.println(Arrays.toString(arr));
        int biggestEl = arr[0];
        int smallestEl = arr[0];
        int indexOfBiggestEl = 0;
        int indexOfSmallestEl = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggestEl) {
                biggestEl = arr[i];
                indexOfBiggestEl = i;
            } else if (arr[i] < smallestEl) {
                smallestEl = arr[i];
                indexOfSmallestEl = i;
            }
        }
        arr[indexOfBiggestEl] = smallestEl;
        arr[indexOfSmallestEl] = biggestEl;
        System.out.println(Arrays.toString(arr));
    }

    private static void printChessboard() {
        System.out.println("Print a chessboard");
        char chessboard[][] = new char[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    chessboard[i][j] = 'B';
                    System.out.print(chessboard[i][j] + " ");
                } else if (i % 2 == 0 && j % 2 == 0) {
                    chessboard[i][j] = 'B';
                    System.out.print(chessboard[i][j] + " ");
                } else if (i % 2 == 0 && j % 2 != 0) {
                    chessboard[i][j] = 'W';
                    System.out.print(chessboard[i][j] + " ");
                } else if (i % 2 != 0 && j % 2 == 0) {
                    chessboard[i][j] = 'W';
                    System.out.print(chessboard[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
