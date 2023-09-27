package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numDays = Integer.parseInt(scanner.nextLine());
        double pricePerNightStudio = 0.00;
        double pricePerNightApartment = 0.00;

        switch (month) {
            case "May":
            case "October":
                pricePerNightStudio = 50.00;
                pricePerNightApartment = 65.00;
                if (numDays > 14) {
                    pricePerNightStudio = 50.00 - (50.00 * 0.30);
                    pricePerNightApartment = 65.00 - (65.00 * 0.10);
                } else if (numDays > 7) {
                    pricePerNightStudio = 50.00 - (50.00 * 0.05);
                }
        break;
        case "June":
        case "September":
            pricePerNightStudio = 75.20;
            pricePerNightApartment = 68.70;
            if (numDays > 14) {
                pricePerNightStudio = 75.20 - (75.20 * 0.20);
                pricePerNightApartment = 68.70 - (68.70 * 0.10);
            }
        break;
        case "July":
        case "August":
            pricePerNightStudio = 76.00;
            pricePerNightApartment = 77.00;
            if (numDays > 14) {
                pricePerNightApartment = 77.00 - (77.00 * 0.10);
            }
        break;
    }
        System.out.printf("Apartment: %.2f lv.%n", (pricePerNightApartment * numDays));
            System.out.printf("Studio: %.2f lv.", (pricePerNightStudio * numDays));
        }

    }

