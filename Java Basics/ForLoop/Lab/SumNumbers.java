package ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int number = 1; number <= countOfNum; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum = sum + value;

        }
        System.out.println(sum);
    }
}

