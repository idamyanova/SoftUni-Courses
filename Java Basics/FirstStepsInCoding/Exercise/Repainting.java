package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint * 1.10) * 14.50;
        double paintThinnerPrice = paintThinner * 5;

        double materialsSum = nylonPrice + paintPrice + paintThinnerPrice + 0.40;
        double Labour = (materialsSum * 0.30) * workHours;

        System.out.println(materialsSum + Labour);



    }
}
