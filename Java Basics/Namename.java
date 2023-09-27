package FirstStepsInCoding;

import java.util.Scanner;

public class Namename {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double C = Double.parseDouble(scanner.nextLine());
        Double F = ((C * 1.8) + 32);
        System.out.printf("%.2f", F);
    }
}
