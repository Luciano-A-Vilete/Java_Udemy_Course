public class OperatorsChallenge {
    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        double third = (first + second) * 100.00;
        double remainder = third % 40.00;
        boolean result = remainder == 0.00 ? true : false;
        System.out.println(result);
        if (!result) {
            System.out.print("got some remainder");
        }
    }
}
