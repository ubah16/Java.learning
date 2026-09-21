import java.util.Scanner;

public class matematikMedInput {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int number1;
        int number2;


        System.out.println("Skriv in tal 1: ");
        number1 = scanner.nextInt();

        System.out.println("Skriv in tal 2: ");
        number2 = scanner.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        double average = (number1 + number2) /2;

        System.out.println("Summan av dina tal är: " + sum);
        System.out.println("Produkten av dina tal är :" + product);
        System.out.println("Medelvärdet av dina tal är: " + average);




    }
}
