package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String typeNumber = "";
        boolean isSecondNumberZero = false;
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                if (result % 2 == 0) {
                    typeNumber = "even";
                } else {
                    typeNumber = "odd";
                }
                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0) {
                    typeNumber = "even";
                } else {
                    typeNumber = "odd";
                }
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0) {
                    typeNumber = "even";
                } else {
                    typeNumber = "odd";
                }
                break;
            case "/":
                if (num2 == 0) {
                    isSecondNumberZero = true;
                } else {
                    result = (num1 * 1.0) / num2;
                }
                break;
            case "%":
                if (num2 == 0) {
                    isSecondNumberZero = true;
                } else {
                    result = num1 % num2;
                }
                break;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, typeNumber);
        } else if (operator.equals("/")) {
            if (isSecondNumberZero) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d / %d = %.2f", num1, num2, result);
            }
        }
        if (operator.equals("%")) {
            if (isSecondNumberZero) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d %s %d = %.0f", num1, operator, num2, result);
            }

        }
    }
}



