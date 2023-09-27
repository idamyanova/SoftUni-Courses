package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberPages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        int totalTimeReading = numberPages / PagesPerHour;
        int HoursPerDay = totalTimeReading / numberDays;
        System.out.println(HoursPerDay);
    }
}

