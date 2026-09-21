import java.util.Scanner;

public class valideringAvInput {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int age;

        System.out.println("Ange din ålder: ");
        age = scanner.nextInt();

        while (age > 120) {
            System.out.println("Ange en giltig ålder.");
            age = scanner.nextInt();

            if (age<=120) {
                System.out.println("Du är " + age + " år gammal.");

           }
        }
    }
}
