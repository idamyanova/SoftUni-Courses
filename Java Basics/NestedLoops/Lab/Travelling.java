package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = (scanner.nextLine());
        while (!input.equals("End")) {
            String destination = input;
            double price = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < price) {
                double amount = Double.parseDouble(scanner.nextLine());
                savedMoney += amount;
            }
                    System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}


