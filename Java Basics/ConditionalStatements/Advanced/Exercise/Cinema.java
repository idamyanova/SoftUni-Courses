package Advanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double ticket = 0;
        double price = 0;

        switch (typeProjection) {
            case "Premiere":
                ticket = 12.00;
                break;
            case "Normal":
                ticket = 7.50;
                break;
            case "Discount":
                ticket = 5.00;
                break;
        }
        price = ticket * rows * columns;

        System.out.printf("%.2f", price);
    }
}
