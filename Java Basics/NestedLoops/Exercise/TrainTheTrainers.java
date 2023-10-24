package NestedLoops.Exersice;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int presentationCount = 0;
        double totalGradeSum = 0.00;

        String presentationName = scanner.nextLine();
        while (!presentationName.equals("Finish")){
            presentationCount ++;
            double scoreSum = 0.00;
            for (int i = 1; i <= n ; i++) {
                double currentScore = Double.parseDouble(scanner.nextLine());
                scoreSum += currentScore;
            }
           double currentAverageScoreAssesment = scoreSum/n;
            totalGradeSum +=currentAverageScoreAssesment;
            System.out.printf("%s - %.2f.%n", presentationName, currentAverageScoreAssesment);
            presentationName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", (totalGradeSum/presentationCount));
    }
}
