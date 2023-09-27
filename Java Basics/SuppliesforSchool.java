package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int penPackage = Integer.parseInt(scanner.nextLine());
        int markerPackage = Integer.parseInt(scanner.nextLine());
        int cleanisingLeter = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceMaterials = (penPackage * 5.80) + (markerPackage * 7.20) + (cleanisingLeter * 1.20);
        System.out.println(priceMaterials - (priceMaterials * (percentDiscount / 100.0)));

    }
}
