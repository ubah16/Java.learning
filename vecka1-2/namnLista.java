import java.util.Scanner;
import java.util.Arrays;

public class namnLista {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Hur många namn vill du ha i listan?: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] names= new String [count];

        for (int i =0; i < names.length; i++) {
            System.out.println("Ange namn: ");
            names [i] = scanner.nextLine();
        }
        Arrays.sort(names);

        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Sök efter ett namn: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i =0; i< names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Namnet hittades");
        } else {
            System.out.println("Namnet kunde ej hittas");
        }

    }
}
