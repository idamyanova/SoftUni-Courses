package ConditionalStatements.If.Basic.Veronika;

import java.util.Scanner;

public class Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //•	под 100 отпечатайте: "Less than 100"
        //•	между 100 и 200 отпечатайте: "Between 100 and 200"
        //•	над 200 отпечатайте: "Greater than 200"
        if (number < 100)
        {
            System.out.print("Less than 100");
        }
        else if (number <= 200) {
            System.out.print("Between 100 and 200");
        }
        else {
            System.out.print("Greater than 200");
        }
    }

    }



