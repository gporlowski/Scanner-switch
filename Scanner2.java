import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego boku: ");
        int firstSide = scan.nextInt();
        System.out.print("Podaj długość drugiego boku: ");
        int secondSide = scan.nextInt();
        System.out.print("Pole prostokąta o bokach " + firstSide + " i " + secondSide + " wynosi: " + firstSide * secondSide);
    }
}
