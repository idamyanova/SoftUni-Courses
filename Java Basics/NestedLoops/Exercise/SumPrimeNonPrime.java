package NestedLoops.Exersice;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrimeNumbers = 0;
        int sumNotPrimeNumbers = 0;

        String input = scanner.nextLine();
        while (!input.equals ("stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean isNotPrime = false;
            for (int i = 2; i < currentNum; i++) {
                if (currentNum % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }
                if (isNotPrime) {
                    sumNotPrimeNumbers += currentNum;
                } else {
                    sumPrimeNumbers += currentNum;
                }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrimeNumbers);
        System.out.println("Sum of all non prime numbers is: " + sumNotPrimeNumbers);
    }
}
