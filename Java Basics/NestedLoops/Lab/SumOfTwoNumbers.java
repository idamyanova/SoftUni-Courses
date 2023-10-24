package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int firstNum = Integer.parseInt(scanner.next());
      int secondNum = Integer.parseInt(scanner.next());
      int magicNum = Integer.parseInt(scanner.next());
      int counter = 0;
      boolean isFound = false;

        for (int i = firstNum; i <=secondNum ; i++) {
            for (int j = firstNum; j <=secondNum; j++) {
                counter++;
                if (i + j == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
        }
        if (!isFound){
    System.out.printf("%d combinations - neither equals %d", counter, magicNum);}
}
    }

