 class InvestmentCalculator {

    public static double computeFutureValue(double principal, double annualRate, int years) {
        return principal * Math.pow(1 + annualRate / 100, years);
    }

    public static void main(String[] args) {
        double principal = 1000; 
        double annualRate = 5; 
        int years = 10; 

        double futureValue = computeFutureValue(principal, annualRate, years);
        System.out.printf("Future value of the investment: $%.2f%n", futureValue);
    }
}
