package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int availableSpace = width * length * height;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int numberOfBoxes = Integer.parseInt(input);
            availableSpace -= numberOfBoxes;
            if (availableSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }
    }
}
