import java.util.Scanner;

public class enkelKonversation {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner (System.in);

        String name = "";
        int age;
        String livesWhere;

        System.out.print("Vad heter du? ");
        name = scanner.nextLine();


        System.out.print("Hur gammal är du? ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Vart bor du? ");
        livesWhere = scanner.nextLine();

        System.out.println("Hej " + name + "!" + " Du är " + age + " år gammal och du bor i " + livesWhere + " stad.");

    }
}