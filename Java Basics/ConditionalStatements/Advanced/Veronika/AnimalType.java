package ConditionalStatements.Advanced.Veronika;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // dog -> mammal
        //
        //· crocodile, tortoise, snake -> reptile
        //
        //· others -> unknown
        String animal = scanner.nextLine();

        switch(animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }

    public static class BonusScore {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());
            double bonusPoints = 0;

            if (number <= 100) {
                bonusPoints = 5;
            } else if (number > 1000) {
                bonusPoints = number * 0.10;
            } else {
                bonusPoints = number * 0.20;
            }
            if (number % 2 == 0) {
                bonusPoints = bonusPoints + 1;
            }
            if
            (number % 10 == 5) {
                bonusPoints = bonusPoints + 2;
            }

            System.out.println(bonusPoints);
            System.out.println(number + bonusPoints);

        }
    }

    public static class SumSeconds {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int firstPlayer = Integer.parseInt(scanner.next());
            int secondPlayer = Integer.parseInt(scanner.next());
            int thirdPlayer = Integer.parseInt(scanner.next());

            int totalTimeInSeconds = firstPlayer + secondPlayer + thirdPlayer;
            int minutes = totalTimeInSeconds / 60;
            int seconds = totalTimeInSeconds % 60;

            if (seconds < 10) {
                System.out.printf("%d:0%d", minutes,seconds);
            } else
            {System.out.printf("%d:%d", minutes,seconds);
            }
        }
    }
}
