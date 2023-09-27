package ConditionalStatements.Advanced.Veronika;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
                case "Friday":
                System.out.println(price = 12);
                break;
            case "Wednesday":
                case "Thursday":
                System.out.println(price = 14);
                break;
            case "Saturday":
                case "Sunday":
                System.out.println(price = 16);
                break;
        }
    }
}
