package FirstStepsInCoding.Veronika;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double price = squareMeters * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %f lv. %n The discount is: %f lv.", finalPrice, discount);


    }
}
