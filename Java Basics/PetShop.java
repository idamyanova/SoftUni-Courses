package FirstStepsInCoding.Veronika;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
                int catFood = Integer.parseInt(scanner.nextLine());
                double dogFoodPrice = dogFood * 2.50;
                int catFoodPrice = catFood * 4;
                double total = dogFoodPrice + catFoodPrice;
                System.out.printf("%f  lv.", total);



    }
}
