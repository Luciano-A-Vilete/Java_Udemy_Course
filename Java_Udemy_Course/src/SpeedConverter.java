public class SpeedConverter {
    public static void main(String[] args) {

    }

    // write your code here

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            return -1;

        } else {

            long milesPerHour = Math.round(kilometersPerHour / 1.609);

            return milesPerHour;

        }

    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            System.out.println("Invalid Value");

        } else {

            float milesPerHour = (float) (kilometersPerHour / 1.609);

            long milesPerHourRounded = Math.round(milesPerHour);

            System.out.println(kilometersPerHour + " km/h = " + milesPerHourRounded + " mi/h");
        }

    }

}
