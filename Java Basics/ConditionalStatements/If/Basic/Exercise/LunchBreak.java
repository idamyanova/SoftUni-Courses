package ConditionalStatements.If.Basic.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int lunchBreakDuration = Integer.parseInt(scanner.nextLine());

        double timeLunch = lunchBreakDuration /8.00;
        double timeRest = lunchBreakDuration /4.00;

        double timeLeft = lunchBreakDuration - (timeLunch + timeRest);

        //"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
        //
        //· Ако времето не Ви е достатъчно:
        //
        //"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
        if (timeLeft >= durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft - durationEpisode));
        } else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(durationEpisode - timeLeft));
        }

    }
}
