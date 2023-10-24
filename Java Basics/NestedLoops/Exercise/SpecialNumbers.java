package NestedLoops.Exersice;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1111; currentNum <= 9999; currentNum++) {
            String currentNumString = (currentNum + "");
            boolean isSpecial = true;
            for (int currentDigit = 0; currentDigit < currentNumString.length(); currentDigit++) {
                int currentDigitInt = Integer.parseInt(currentNumString.charAt(currentDigit) +"");
                if (currentDigitInt ==0){
                    isSpecial = false;
                    break;
                } if (n % currentDigitInt != 0){
                    isSpecial = false;
                    break;
                }

            }
            if (isSpecial) {
                System.out.print(currentNum + " ");
            }
        }







    }
}
