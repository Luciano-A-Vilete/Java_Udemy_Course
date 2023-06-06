public class checkNumber {
    public static void main(String[] args) {

        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.print("positive");
        } else if (number < 0) {
            System.out.print("negative");
        } else {
            System.out.print("zero");
        }

        return;
    }
}
