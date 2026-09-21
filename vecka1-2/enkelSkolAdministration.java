import java.util.Scanner;

public class enkelSkolAdministration {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Hur många studenter vill du registrera?");
        int students = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String [students];
        double[] avrages = new double [students];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Skriv ditt namn: ");
            String name = scanner.nextLine();
            names[i] = name;

            System.out.println("Skriv in betyg 1: ");
            int grade1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Skriv in betyg 2: ");
            int grade2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Skriv in betyg 3: ");
            int grade3 = scanner.nextInt();
            scanner.nextLine();

            double median = (grade1 + grade2 + grade3) /3;
            avrages[i] = median;

            System.out.println("Ditt medel betyg är: " + median);

            if (median >= 60){
                System.out.println("Du är godkänd!");
            } else {
                System.out.println("Du är inte godkänd.");
            }
        }
        for (int i =0; i < names.length; i++) {
            System.out.println(names[i] + ":" + avrages[i]);
        }
    }
}
