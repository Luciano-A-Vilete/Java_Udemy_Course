import java.util.Scanner;

public class ForLoopChallenge {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Escolha um número inteiro menor que 1000: ");
        int numero = in.nextInt();
        in.close();

        int count = 0;
        for (int i = numero; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total Number of prime number between " + numero + " and 1000 is " + count);
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;

    }

}
