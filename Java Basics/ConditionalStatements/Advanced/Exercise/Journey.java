package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spentMoney = 0.00;
        String destination = "";
        String typeHoliday = "";

        if (budget <= 100.00) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    spentMoney = budget * 0.30;
                    typeHoliday = "Camp";
                    break;
                case "winter":
                    spentMoney = budget * 0.70;
                    typeHoliday = "Hotel";
                    break;
            }
        } else if (budget <= 1000.00) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    spentMoney = budget * 0.40;
                    typeHoliday = "Camp";
                    break;
                case "winter":
                    spentMoney = budget * 0.80;
                    typeHoliday = "Hotel";
                    break;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            spentMoney = budget * 0.90;
            typeHoliday = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeHoliday, spentMoney);
    }
}




