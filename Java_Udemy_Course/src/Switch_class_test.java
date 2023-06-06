public class Switch_class_test {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        /*int switchvalue = 3;

        switch (switchvalue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was not 1 or 2");
        }*/

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st Quarter";
            case "April", "May", "June" -> "2nd Quarter";
            case "July", "August", "September" -> "3th Quarter";
            case "October", "November", "December" -> "4th Quarter";
            default -> "Invalid Month";
        };
    }
}
