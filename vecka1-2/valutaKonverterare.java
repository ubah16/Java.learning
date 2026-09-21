import java.util.Scanner;

public class valutaKonverterare {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        double sek;

        System.out.print("Vilken summa vill du konvertera till EUR och USD?: ");
        sek = scanner.nextDouble();

        double eur = sek * 0.085;
        double usd = sek * 0.091;

        System.out.println(sek + " SEK blir: " + eur + " EUR & " + usd + " USD");






    }
}
