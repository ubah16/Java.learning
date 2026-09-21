import java.util.Scanner;

public class poängRäknare {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hur många poäng vill du mata in? ");
        int antal = scanner.nextInt();

        int[] scores = new int[antal];

        for (int index = 0; index < scores.length; index++) {
            System.out.print("Ange poäng nummer " + (index + 1) + ": ");
            scores[index] = scanner.nextInt();
        }

        printScores (scores);

        int sum = calculateSum(scores);
        System.out.println("Total poäng: " + sum);

        double average = calculateAverage(scores);
        System.out.println("Medelpoäng: " + average);

        int largest = findLargest(scores);
        System.out.println("Största poäng: " + largest);

        int smallest = findSmallest(scores);
        System.out.println("Minsta poäng: " + smallest);

    }
    public static void printScores (int[] scores) {
        System.out.println("Poäng: ");

        for (int index=0; index< scores.length; index++) {
            System.out.println("Poäng: " + (index +1) + ":" + scores[index]);
        }

    }
    public static int calculateSum(int[] values) {
        int sum = 0;

        for (int index=0; index < values.length; index++) {
            sum = sum + values[index];

        }
        return sum;
    }
    public static double calculateAverage(int[] values) {
        int sum =0;
        for (int index=0; index< values.length; index++) {
            sum = sum + values[index];
        }
        double average = sum / values.length;
        return average;
    }

    public static int findLargest(int[] scores) {
        int largest=0;

        for (int index=0; index< scores.length; index++) {
            if (scores[index]> largest) {
                largest = scores [index];
            }
        }
        return largest;
    }

    public static int findSmallest(int[] scores) {
        int smallest=0;

        for (int index=0; index< scores.length; index++) {
            if (scores[index] < smallest) {
                smallest = scores [index];
            }
        }
        return smallest;
    }


}

