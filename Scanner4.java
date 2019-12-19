import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pole liczbę naturalną: ");
        int letter = scan.nextInt();
        boolean prime = primeNumber(letter);
        if (prime) {
            System.out.println("Liczba " + letter + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + letter + " nie jest liczbą pierwszą.");
        }
    }
    public static boolean primeNumber (int letter) {
        if (letter < 2) {
            return false;
        }
        for (int i = 2; i * i <= letter; i++) {
            if (letter % i == 0) {
                return false;
            }
        }
        return true;
    }
}
