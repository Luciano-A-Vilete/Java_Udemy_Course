public class TeenNumberChecker {
    public static void main(String[] args) {

        hasTeen(5,3,15);

    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    public static boolean isTeen(int num4) {
        return (num4 > 12 && num4 < 20);
    }
}
