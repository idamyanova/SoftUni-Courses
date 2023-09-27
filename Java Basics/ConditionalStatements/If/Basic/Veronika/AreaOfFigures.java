package ConditionalStatements.If.Basic.Veronika;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFigure = scanner.nextLine();
        double area = 0;

        if (nameFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
            } else if
        (nameFigure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;

        } else if
        (nameFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if
        (nameFigure.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB / 2;

        }
System.out.printf("%.2f", area);
    }
}
