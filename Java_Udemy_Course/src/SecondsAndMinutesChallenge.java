public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));

    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + minutes + "), must be a value grater than 0 and less than 60";
        }

        int hours = minutes / 60;
        int remaining_minutes = minutes % 60;

        return hours + "h " + remaining_minutes + "m " + seconds + "s";
    }

}
