public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600L);
    }

    public static void printYearsAndDays(Long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            Long hour = minutes / 60;
            Long day = hour / 24;
            Long year = day / 365;
            Long remaining_days = day % 365;

            System.out.println(minutes + " min = " + year + " y " + remaining_days + " d");
        }
    }
}
