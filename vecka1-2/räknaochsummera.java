import java.util.Scanner;

public class räknaochsummera {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        for (int i = 1; i<= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i>= 1; i--) {
            System.out.println(i);
        }
        for (int i = 2; i<= 20; i +=2) {
            System.out.println(i);
        }
        int summa = 0;
        for (int i =1; i<= 100; i++) {
            summa += i;
        }
        System.out.println("Summan är: " + summa);

    }
}
