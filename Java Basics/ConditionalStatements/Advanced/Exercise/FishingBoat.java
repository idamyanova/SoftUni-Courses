package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFisher = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000.00;
                break;
            case "Summer":
            case "Autumn":
                price = 4200.00;
                break;
            case "Winter":
                price = 2600.00;
                break;
        }

        if (numFisher <= 6) {
            price = price - (price * 0.10);
        } else if (numFisher > 7 && numFisher <= 11) {
            price = price - (price * 0.15);
        } else if (numFisher > 12) {
            price = price - (price * 0.25);
        }

        if (numFisher % 2 == 0 && !season.equals("Autumn")) {
            price = price - (price * 0.05);
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
        }
    }
    }
