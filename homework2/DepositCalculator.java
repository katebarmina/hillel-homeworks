class DepositCalculator {

    static void printDepositInfo(double moneyDeposit, double annualInterestRate, int numberOfYears) {
        double percent;
        double accruedInterest = 0;
        int currentYear = 2022;
        for (int i = 0; i < numberOfYears; i++) {
            percent = (moneyDeposit * (annualInterestRate / 100));
            moneyDeposit += percent;
            accruedInterest += percent;
            System.out.println(currentYear + i + " Balance: " + moneyDeposit + " Accrued interest: " + accruedInterest);
        }

    }

    public static void main(String[] args) {
        printDepositInfo( Double.parseDouble(args[0]),Double.parseDouble(args[1]),Integer.parseInt(args[2]));
    }
}
