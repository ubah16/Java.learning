import java.util.Scanner;

public class betygssystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade;

        System.out.println("Vad fick du för poäng på senaste provet?: ");
        grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Du fick betyget: A!");
        } else if (grade >= 80) {
            System.out.println("Du fick betyget: B!");
        } else if (grade >= 70) {
            System.out.println("Du fick betyget: C!");
        } else if (grade >= 60) {
            System.out.println("Du fick betyget: D!");
        } else {
            System.out.println("Du fick betyget: F");
        }



    }
}
