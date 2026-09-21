import java.util.Scanner;

public class ålderskontroll {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int age;

        System.out.print("Hur gammal är du?");
        age = scanner.nextInt();
        if (age >= 65) {
            System.out.println("Du är pensionär eftersom att du är 65+");
        }if (age >= 20) {
            System.out.println("Du får handla på systembolaget och köpa alkohol eftersom att du är 20+ ");
        }if (age >= 18) {
            System.out.println("Du får köra bil eftersom att du är 18+");
        }else {
            System.out.println("Du är minderårig eftersom att du inte är 18+");
        }


    }
}
