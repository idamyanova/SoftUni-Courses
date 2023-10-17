package WhileLoop._Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        int year = 1;
        int poorMarks = 0;

        while (year <= 12) {
            if (poorMarks > 1) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4) {
                poorMarks++;
                continue;
            }
            year++;
            sum += currentGrade;

        }
        if (poorMarks > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
          double averageScore = sum/ 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageScore);
        }
    }
}