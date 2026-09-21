import java.util.Scanner;

public class textAnalys {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv en mening: ");
        String sentance = scanner.nextLine();

        System.out.println("Antal täcken: " + sentance.length());

        int vowelCount =0;

        for (int i =0; i< sentance.length(); i++) {
            char characters = sentance.charAt(i);

            if (characters == 'a' || characters == 'e' ||characters == 'i' ||characters == 'o' ||characters == 'u' ||characters == 'y') {
                vowelCount++;
            }
        }
        System.out.println("Antalet vokaler i din mening är: " + vowelCount);
    }
}
