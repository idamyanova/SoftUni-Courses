package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countOfNum = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int num = 1; num <= countOfNum; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0){
                sum1 += value;
            } else {sum2 += value;
            }
        }
        if (sum1 == sum2) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum1);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum1 - sum2));
        }
    }
}
