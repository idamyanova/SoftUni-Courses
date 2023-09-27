package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMenu = Double.parseDouble(scanner.nextLine());
        double fishMenu = Double.parseDouble(scanner.nextLine());
        double vegiterianMenu = Double.parseDouble(scanner.nextLine());
        //Пилешко меню – 10.35 лв.
        //
        //• Меню с риба – 12.40 лв.
        //
        //• Вегетарианско меню – 8.15 лв.
        double PriceChickenMenu = chickenMenu * 10.35;
        double PriceFishMenu = fishMenu * 12.40;
        double PriceVegiterianMenu = vegiterianMenu * 8.15;

        double priceFood = PriceChickenMenu + PriceFishMenu + PriceVegiterianMenu;
        double dessert = priceFood * 0.20;

        System.out.println(priceFood + dessert + 2.50);
    }
}
