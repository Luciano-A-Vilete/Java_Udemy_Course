public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2048);
        printMegaBytesAndKiloBytes(5675);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaByte = (kiloBytes / 1024);
        int remainderKiloBytes = (kiloBytes % 1024);
//            System.out.print(kiloBytes" KB = "+megaByte+" MB and " +remainderKiloBytes+ " KB");
        System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes+" KB = "+megaByte+" MB and "+remainderKiloBytes+" KB");
    }

}

