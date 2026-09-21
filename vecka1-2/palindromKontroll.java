import java.util.Scanner;

public class palindromKontroll {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Skriv ett ord: ");
        String word = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i=0; i <word.length()/2; i++){
            char front = word.charAt(i);
            char back = word.charAt(word.length() -1 -i);

            if (front != back) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrom!");
        } else {
            System.out.println("Inte palindrom.");
        }
    }
}
