package ConditionalStatements.If.Basic.Exercise;

import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distanceInMetres / 15) * 12.5;

        double totalTimeInSeconds = distanceInMetres * timeInSecondsPerMeter;

        totalTimeInSeconds = totalTimeInSeconds + delay;

        if(totalTimeInSeconds < recordInSeconds) {
            System.out.printf( "Yes, he succeeded! The new world record is %.2f seconds.", totalTimeInSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimeInSeconds - recordInSeconds);
        }
    }
}
