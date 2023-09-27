package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourTestBegin = Integer.parseInt(scan.nextLine());
        int minutesTestBegin = Integer.parseInt(scan.nextLine());
        int hourStudentArrival = Integer.parseInt(scan.nextLine());
        int minutesStudentArrival = Integer.parseInt(scan.nextLine());

        int testBeginMinutes = hourTestBegin * 60 + minutesTestBegin;
        int studentArrivalMinutes = hourStudentArrival * 60 + minutesStudentArrival;
        int differentMinutes = testBeginMinutes - studentArrivalMinutes;

        if (differentMinutes > 30) {
            System.out.println("Early");
            int hourToTest = differentMinutes / 60;
            int minutesToTest = differentMinutes % 60;
            if (hourToTest == 0) {
                System.out.println(minutesToTest + " minutes before the start");
            } else if (minutesToTest <= 9) {
                System.out.printf("%d:%02d hours before the start", hourToTest, minutesToTest);
            } else {
                System.out.printf("%d:%d hours before the start", hourToTest, minutesToTest);
            }
        } else if (differentMinutes > 0) {
            System.out.println("On time");
            System.out.println(differentMinutes + " minutes before the start");
        } else if (differentMinutes == 0) {
            System.out.println("On time");
        } else {
            System.out.println("Late");
            differentMinutes = Math.abs(differentMinutes);
            int hoursLate = differentMinutes / 60;
            int minutesLate = differentMinutes % 60;
            if (hoursLate > 0) {
                if (minutesLate <= 9) {
                    System.out.printf("%d:%02d hours after the start", hoursLate, minutesLate);
                } else {
                    System.out.printf("%d:%d hours after the start", hoursLate, minutesLate);
                }
            } else {
                System.out.println(minutesLate + " minutes after the start");
            }
        }
    }
}

