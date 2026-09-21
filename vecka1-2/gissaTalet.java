import java.util.Scanner;

public class gissaTalet {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 47;
        int guess = -1;
        int numberOfGuesses =0;


        while (guess != number) {
            System.out.println("Gissa ett nummer mllan 1-100: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (number == guess) {
                System.out.println("Bra, rätt tal!");
            } else if (guess > number) {
                System.out.println("För högt.");
            } else if (guess < number) {
                System.out.println("För lågt.");
            }
        }
        System.out.println("Det tog dig " + numberOfGuesses + " gissningar.");
    }
}

