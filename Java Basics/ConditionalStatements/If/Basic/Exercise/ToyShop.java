package ConditionalStatements.If.Basic.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.next());
        int dolls = Integer.parseInt(scanner.next());
        int bears = Integer.parseInt(scanner.next());
        int minion = Integer.parseInt(scanner.next());
        int truck = Integer.parseInt(scanner.next());

        int allToys = puzzle + dolls + bears + minion + truck;
        double priceToys = puzzle * 2.60 + dolls * 3 + bears * 4.10 + minion * 8.20 + truck * 2;

        if (allToys >= 50){
            priceToys = priceToys - (priceToys * 0.25);
        }
        priceToys = priceToys - (priceToys * 0.10);

        if (priceToys >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.", (priceToys - priceExcursion));
        }
            else{
                System.out.printf("Not enough money! %.2f lv needed.", (priceExcursion-priceToys));
            }



    }
}
