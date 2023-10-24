package NestedLoops.Exersice;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isValid = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= rows; column++) {
                counter++;
                System.out.print(counter + " ");
                if (counter == n){
                    isValid = true;
                    break;
                }
            }
            System.out.println();
            if (isValid) {
                break; }
            }
        }
    }

