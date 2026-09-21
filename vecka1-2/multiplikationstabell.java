import java.util.Scanner;

public class multiplikationstabell {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int number;

        System.out.println("Vilket tals multiplikationstabell vill du se? ");
        number = scanner.nextInt();

        for (int i =1; i <= 10; i++) {
            System.out.println(number * i);
        }

    }
}
