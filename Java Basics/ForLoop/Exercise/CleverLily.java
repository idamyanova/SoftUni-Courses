package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        double birthdayMoney = 10.00;
        double totalSum = 0.00;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 ==0){
               totalSum += birthdayMoney;
                birthdayMoney += 10.00;
                totalSum -=1.00;
            } else {
                toys++;
            }

        }

        totalSum = (toys * toyPrice) + totalSum;

        if (totalSum >= washingMachinePrice){
            System.out.printf("Yes! %.2f", (totalSum - washingMachinePrice));
        }else { System.out.printf("No! %.2f", (washingMachinePrice - totalSum));

        }
    }
}
