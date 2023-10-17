package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsPerDay = 10000;
        int totalSteps = 0;

        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps += steps;
            if (totalSteps >= stepsPerDay) {
                break;
            }
            input = scanner.nextLine();
        }
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                totalSteps +=stepsToHome;
            }
        if (totalSteps < stepsPerDay) {
            System.out.printf("%d more steps to reach goal.", (stepsPerDay - totalSteps));
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", (totalSteps - stepsPerDay));
        }
    }
}