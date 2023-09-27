package ConditionalStatements.If.Basic.Exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allTimeinMinutes = minutes + (hour * 60) + 15;

        hour = allTimeinMinutes / 60;
        minutes = allTimeinMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minutes);

    }
}
