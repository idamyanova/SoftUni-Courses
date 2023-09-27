package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());
        // Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double sneakersPrice = annualTax - (annualTax * 0.40);
        double suitPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ball = suitPrice / 4;
        double accesories = ball / 5;
        System.out.println(sneakersPrice + suitPrice + ball + accesories + annualTax);


    }
}
