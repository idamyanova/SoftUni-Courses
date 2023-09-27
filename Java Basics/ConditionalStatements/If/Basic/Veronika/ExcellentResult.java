package ConditionalStatements.If.Basic.Veronika;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Score = Integer.parseInt(scanner.nextLine());

        if (Score >= 5) {
            System.out.println ("Excellent!");
        }
    }
}
