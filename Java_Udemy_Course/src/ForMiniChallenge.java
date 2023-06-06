public class ForMiniChallenge {
    public static void main(String[] args) {

        for (double rate = 7.50; rate <= 10.00; rate += 0.25) {
            double interestAmount = calculateInterest(100.00, rate);
            System.out.println("$100.00 at " + rate + "% interest = $" + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double rate) {

        return (amount * (rate / 100));
    }

}
