public class DecimalComparator {
    public static void main(String[] args) {

    }
        public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
            int one = (int) (num1 * 1000);
            int two = (int) (num2 * 1000);
            if (one == two) {
                return true;
            } else {
                return false;
            }
        }
}
