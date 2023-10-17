package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;

            if (value >= maxNumber) {
                maxNumber = value;
            }

        }
        if (maxNumber == sum - maxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNumber);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxNumber - (sum - maxNumber)));
        }
    }
}
