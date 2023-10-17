package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int failedNumber = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int numberOfProblems = 0;
        double averageSum = 0;
        String lastProblem = "";

        String nameTask = scanner.nextLine();
        while (!nameTask.equals ("Enough")) {
            int currentGrade = Integer.parseInt(scanner.nextLine());
            if (currentGrade<=4) {
                failedTimes++;
            }
                if (failedTimes ==failedNumber){
                    System.out.printf ("You need a break, %d poor grades.", failedTimes);
                    break;
                }
            numberOfProblems++;
            averageSum +=currentGrade;
        lastProblem = nameTask;
     nameTask = scanner.nextLine();
            }
        averageSum = averageSum * 1.0 /numberOfProblems;

        if (nameTask.equals ("Enough")) {
            System.out.printf("Average score: %.2f%n", averageSum);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }

        }
    }

