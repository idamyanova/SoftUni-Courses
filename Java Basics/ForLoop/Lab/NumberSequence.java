package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int countNumber = 1; countNumber <=number ; countNumber++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            } if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
            }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
        }
    }

