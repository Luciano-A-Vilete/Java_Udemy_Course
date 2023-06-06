public class BarkingDog {
    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            wakeUp = false;
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            wakeUp = true;
        } else {
            wakeUp = false;
        }
        return wakeUp;
    }

}
