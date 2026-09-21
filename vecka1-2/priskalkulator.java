import java.util.Scanner;

public class priskalkulator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price;
        boolean ifStudent;
        boolean ifMember;

        System.out.println("Vad är priset på din vara?: ");
        price = scanner.nextInt();
        scanner.nextLine(); //resnsar

        System.out.println("Är du student (svara JA/NEJ): ");
        String student = scanner.nextLine();
        ifStudent = student.equalsIgnoreCase("JA");

        System.out.println("Är du medlem (svara JA/NEJ): ");
        String member = scanner.nextLine();
        ifMember = member.equalsIgnoreCase("JA");

        double discountPrecetage;

        if (ifStudent && ifMember) {
            discountPrecetage = 0.15;
        }else if (ifStudent) {
            discountPrecetage = 0.10;
        }else if (ifMember) {
            discountPrecetage = 0.05;
        }else {
            discountPrecetage = 0.0;
        }

        double discount = price * discountPrecetage;
        double finalPrice = price - discount;

        System.out.println("Originalpris = " + price + "Kr");
        System.out.println("Rabatt = " + discount + "Kr");
        System.out.println("Slutpris = " + finalPrice + "Kr");
    }
}
