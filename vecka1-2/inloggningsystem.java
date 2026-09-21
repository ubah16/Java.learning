import java.util.Scanner;

public class inloggningsystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user;
        String password;

        System.out.print("Skriv in ditt användarnamn: ");
        user = scanner.nextLine();

        System.out.print("Skriv in ditt lösenord: ");
        password = scanner.nextLine();

        if (user.equals ("Admin")  && password.equals ("Password123")) {
            System.out.println("Välkommen Admin!");
        } else {
            System.out.println("Fel användarnamn eller lösenord");
        }
    }
}
