public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int inches) {
        double centimeters = (inches * 2.54);
        return Math.round(centimeters);
    }

    public static double convertToCentimeters(int inches_foot, int remained_inches) {
        double foot_inches = ((inches_foot + remained_inches) * 0.0833333);
        double inches = foot_inches;
        return convertToCentimeters((int) ((foot_inches * 12) + remained_inches));

    }

}
