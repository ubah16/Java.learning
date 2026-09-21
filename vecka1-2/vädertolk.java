import java.util.Scanner;

public class vädertolk {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int wheater;

        System.out.print("Vad är temperaturen idag?: ");
        wheater = scanner.nextInt();

        if (wheater > 20) {
            System.out.println("Det är shorts väder idag!");
        } else if (wheater > 10) {
            System.out.println("Perfekt väder för en hoodie!");
        } else if (wheater > 0) {
            System.out.println("Klä dig varmt!");
        } else if (wheater < 0) {
            System.out.println("Ta på dig vinterjacka!");
        }

    }
}
