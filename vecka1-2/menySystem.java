import java.util.Scanner;

public class menySystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int choice = 0;
        double width =0;
        double height =0;
        double radius =0;

        while (choice != 3) {
            System.out.println("1. Räkna ut arean av en rektangel");
            System.out.println("2. Räkna ut arean av en cirkel");
            System.out.println("3. Avsluta...");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Ange bredd för rektangeln: ");
                    width = scanner.nextDouble();
                    System.out.println("Ange höjd för rektangeln: ");
                    height = scanner.nextDouble();
                    double areaR = width * height;
                    System.out.println("Arean av rektangeln är: " + areaR);
                    break;

                case 2:
                    System.out.println("Ange radien för cirkeln");
                    radius = scanner.nextDouble();
                    double areaC = Math.PI * radius * radius;
                    System.out.println("Arean av cirkeln är: " + areaC);

                case 3:
                    System.out.println("Avslutar programmet...");

            }
        }
    }
}
