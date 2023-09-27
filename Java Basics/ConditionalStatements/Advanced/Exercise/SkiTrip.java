package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDaysOfStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rate = scanner.nextLine();
        double priceRoom = 0.00;
        double totalPriceRoom = 0.00;
        double discount = 0.00;

        switch (typeRoom) {
            case "room for one person":
                priceRoom = 18.00;
                break;
            case "apartment":
                priceRoom = 25.00;
                if (numDaysOfStay > 15) {
                    priceRoom = priceRoom - (priceRoom * 0.50);
                } else if (numDaysOfStay < 10) {
                    priceRoom = priceRoom - (priceRoom * 0.30);
                } else {
                    priceRoom = priceRoom - (priceRoom * 0.35);
                }
                break;
            case "president apartment":
    priceRoom = 35.00;
        if (numDaysOfStay > 15) {
            priceRoom = priceRoom - (priceRoom * 0.20);
        } else if (numDaysOfStay < 10) {
            priceRoom = priceRoom - (priceRoom * 0.10);
        } else {
            priceRoom = priceRoom - (priceRoom * 0.15);
    }
                break;
}
        totalPriceRoom = priceRoom * (numDaysOfStay - 1);
        if (rate.equals("positive")){
            totalPriceRoom = totalPriceRoom + (totalPriceRoom * 0.25);
        }else if (rate.equals("negative")){
            totalPriceRoom = totalPriceRoom - (totalPriceRoom * 0.10);
        }
        System.out.printf("%.2f", totalPriceRoom);
    }
}
