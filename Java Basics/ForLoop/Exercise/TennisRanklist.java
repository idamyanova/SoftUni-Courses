package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourNumber = Integer.parseInt(scanner.nextLine());
        int firstPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = firstPoints;
        double winTours = 0;
        int averagePoints = 0;
        double percentWinTours = 0;

        for (int i = 0; i < tourNumber; i++) {
            String tourPhase = scanner.nextLine();
            switch(tourPhase){
                case "W":
                    totalPoints += 2000;
                    winTours++;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }

            }
        averagePoints = (totalPoints - firstPoints)/tourNumber;
        percentWinTours = (winTours/tourNumber)*100.00;



        System.out.printf("Final points: %d%n",totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", percentWinTours);

            }

            
        }
