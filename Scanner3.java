import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pole której figury chcesz obliczyć? (kwadrat / prostokąt / koło / trójkąt): ");
        String figure = scan.nextLine();
        switch (figure) {
            case "kwadrat":
                System.out.print("Podaj długość boku: ");
                int a = scan.nextInt();
                System.out.println("Pole kwadratu wynosi: " + a * a);
                System.out.println("Obwód kwadratu wynosi: " + a * 4);
                break;
            case "prostokąt":
                System.out.print("Podaj długość pierwszego boku: ");
                a = scan.nextInt();
                System.out.print("Podaj długość drugiego boku: ");
                int b = scan.nextInt();
                System.out.println("Pole prostokąta wynosi: " + a * b);
                System.out.println("Obwód prostokąta wynosi: " + ((a * 2) + (b * 2)));
                break;
            case "koło":
                System.out.print("Podaj promień koła: ");
                a = scan.nextInt();
                System.out.println("Pole koła wynosi: ~" + 3.14 * (a * a));
                System.out.println("Obwód koła wynosi: ~" + 6.28 * a);
                break;
            case "trójkąt":
                System.out.print("Podaj długość podstawy trójkąta: ");
                a = scan.nextInt();
                System.out.print("Podaj wysokość trójkąta: ");
                b = scan.nextInt();
                System.out.println("Pole trójkąta wynosi: " + (a * b) / 2);
                break;
            default:
                System.out.println("Podałeś złą nazwę figury.");
                break;
        }
    }
}
