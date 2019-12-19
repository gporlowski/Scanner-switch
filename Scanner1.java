import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int letter = scan.nextInt();
        System.out.println("Oto wszystkie liczby naturalne mniejsze od " + letter + ": ");
        for (int i = 1; i < letter; i++) {
            System.out.print(i + " ");
        }
    }
}
