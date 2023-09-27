package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
         int periodDeposit = Integer.parseInt(scanner.nextLine());
         double annualPercent = Double.parseDouble(scanner.nextLine()) / 100;

         double sum = depositSum + periodDeposit * ((depositSum * annualPercent) / 12);
         System.out. println(sum);

    }
}
