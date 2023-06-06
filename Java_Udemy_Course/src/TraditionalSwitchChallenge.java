public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        convertNatoSwitch("c");
        convertNatoSwitch("a");
        convertNatoSwitch("r");
        convertNatoSwitch("3");
    }

    public static String convertNatoSwitch(String letter) {
        switch (letter) {
            case "a":
                System.out.println(letter + " = Able");
                break;
            case "b":
                System.out.println(letter + " = Baker");
                break;
            case "c":
                System.out.println(letter + " = Charlie");
                break;
            case "d":
                System.out.println(letter + " = Dog");
                break;
            case "e":
                System.out.println(letter + " = Easy");
                break;
            case "f":
                System.out.println(letter + " = Fox");
                break;
            case "g":
                System.out.println(letter + " = George");
                break;
            case "h":
                System.out.println(letter + " = How");
                break;
            case "i":
                System.out.println(letter + " = Item");
                break;
            case "j":
                System.out.println(letter + " = Jig");
                break;
            case "k":
                System.out.println(letter + " = King");
                break;
            case "l":
                System.out.println(letter + " = Love");
                break;
            case "m":
                System.out.println(letter + " = Mike");
                break;
            case "n":
                System.out.println(letter + " = Nan");
                break;
            case "o":
                System.out.println(letter + " = Oboe");
                break;
            case "p":
                System.out.println(letter + " = Peter");
                break;
            case "q":
                System.out.println(letter + " = Queen");
                break;
            case "r":
                System.out.println(letter + " = Roger");
                break;
            case "s":
                System.out.println(letter + " = Sugar");
                break;
            case "t":
                System.out.println(letter + " = Tare");
                break;
            case "u":
                System.out.println(letter + " = Uncle");
                break;
            case "v":
                System.out.println(letter + " = Victor");
                break;
            case "w":
                System.out.println(letter + " = William");
                break;
            case "x":
                System.out.println(letter + " = X-Ray");
                break;
            case "y":
                System.out.println(letter + " = Yoke");
                break;
            case "z":
                System.out.println(letter + " = Zebra");
                break;
            default:
                System.out.println("Not found.");

        }
        return letter;
    }
}
