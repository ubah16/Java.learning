import java.util.Scanner;

public class temperaturLogger {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur många tempraturer vill du registrera?");
        int numberOfDays = scanner.nextInt();

        while (numberOfDays<= 0) {
            System.out.println("Du måste registera minst en temperatur!");
            System.out.println("\nHur många temperaturer vill du registrera?");
            numberOfDays = scanner.nextInt();
        }
        int[] temperatures = new int[numberOfDays];

        for (int index=0; index < temperatures.length; index++) {
            System.out.println("Ange temperatur för dag " + (index + 1) + ". ");
            temperatures[index] = scanner.nextInt();
        }

        int sum=0;

        System.out.println("\n---Registrerade temperaturer---");

        for (int index=0; index< temperatures.length; index++) {
            System.out.println("Dag " + (index+1) + "." + temperatures[index] + " grader.");
            sum = sum + temperatures[index];
        }

        double avrage=  (double) sum / temperatures.length;
        System.out.println("Medeltempratur: " + avrage + " grader.");

    }
}

