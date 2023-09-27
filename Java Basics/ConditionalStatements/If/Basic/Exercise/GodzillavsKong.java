package ConditionalStatements.If.Basic.Exercise;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
            double priceCostumePerActor = Double.parseDouble(scanner.nextLine());

            double decor = filmBudget * 0.10;

            double priceCostumeAllActors = actors * priceCostumePerActor;

            if (actors > 150) {
                priceCostumeAllActors = priceCostumeAllActors - (priceCostumeAllActors * 0.10);
            }

            double moviePrice = priceCostumeAllActors + decor;

            if (moviePrice > filmBudget) {
                System.out.println("Not enough money!");
                       System.out.printf("Wingard needs %.2f leva more.", moviePrice - filmBudget);
        } else {
               System.out.println("Action!");
                       System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget - moviePrice);
            }

    }
}
