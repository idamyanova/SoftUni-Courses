package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double pennies = Math.round(change * 100);
        int coins = 0;

        while (pennies > 0) {
            if (pennies - 200 >= 0) {
                pennies -= 200;
                coins++;
            } else if (pennies - 100 >= 0) {
                pennies -= 100;
                coins++;
            } else if (pennies - 50 >= 0) {
                pennies -= 50;
                coins++;
            } else if (pennies - 20 >= 0) {
                pennies -= 20;
                coins++;
            } else if (pennies - 10 >= 0) {
                pennies -= 10;
                coins++;
            } else if (pennies - 5 >= 0) {
                pennies -= 5;
                coins++;
            } else if (pennies - 2 >= 0) {
                pennies -= 2;
                coins++;
            } else {
                pennies-= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}



