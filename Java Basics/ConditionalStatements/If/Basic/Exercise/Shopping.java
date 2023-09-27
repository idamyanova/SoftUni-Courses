package ConditionalStatements.If.Basic.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        double procesors = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());

        double videoCardsSum = videocards * 250;
        double procesorSumPerOne = videoCardsSum * 0.35;
        double ramSumPerOne = videoCardsSum * 0.10;

        double totalPrice = videoCardsSum + (procesors * procesorSumPerOne) + (ram * ramSumPerOne);

        if (videocards > procesors) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }

    }
}
