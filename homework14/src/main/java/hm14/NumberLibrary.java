package hm14;

public class NumberLibrary {
    private final String[][] matrix = new String[5][6];

    public void printZero() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (((i == 0 || i == 4) && (j != 0 && j != 5)) || (i > 0 && i < 4) && ((j == 0 || j == 5))) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printOne() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i < 4 && ((j == 2 || j == 3) || (i == 1 && j == 1) || (i == 2 && j == 0))) || (i == 4)) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);

    }

    public void printTwo() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i % 2 == 0) || (j == 0 && i == 3) || (j == 5 && i == 1)) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printThree() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0 || j == 5) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printFour() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j >= 4 || i == 2) || (i <= 2 && j == 0)) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printFive() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == 0) || (i % 2 == 0 && j < 5) || (j >= 4 && i == 3) || (j < 2 && i == 1)) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printSix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == 0 && j > 0) || (i == 1 && j < 2) || (i == 2 && j < 5) || (i == 3 && (j < 2 || j >= 4)) || (i == 4 && j > 0 && j < 5)) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printSeven() {
        int counter = matrix.length + 1;
        int counter2 = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    matrix[i][j] = "@";
                } else if (j < counter && j >= counter2) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
            counter2--;
            counter--;
        }
        printMatrix(matrix);
    }

    public void printEight() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (((i == 0 || i == matrix.length - 1) && (j > 0 && j < matrix.length)) || (i == 2 && j < matrix.length && j > 0) || (i % 2 != 0 && (j < 1 || j > matrix.length - 1))) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    public void printNine() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == 1 && (j < 2 || j >= matrix.length - 1)) || (i % 2 == 0 && j > 0) || (i == 3 && j >= matrix.length - 1)) {
                    matrix[i][j] = "@";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        printMatrix(matrix);
    }

    private void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
