package NestedLoops.Exersice;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        double standard = 0.00;
        double student = 0.00;
        double kid = 0.00;
        double totalTickets = 0.00;
        boolean isFull = false;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            double ticketCount = 0.00;

            while (!ticketType.equals("End")) {

                if (ticketType.equals("standard")) {
                    standard++;
                } else if (ticketType.equals("student")) {
                    student++;
                } else if (ticketType.equals("kid")) {
                    kid++;
                }
                ticketCount++;
                totalTickets++;
                if (ticketCount >= freeSeats) {
                    isFull = true;
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double percentCount = (ticketCount / freeSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentCount);
            ticketCount = 0.00;
            movieName = scanner.nextLine();

        }
        System.out.printf("Total tickets: %.0f%n", totalTickets);

        double studentTickets = (student / totalTickets) * 100;
        double standardTickets = (standard / totalTickets) * 100;
        double kidTickets = (kid / totalTickets) * 100;

        System.out.printf("%.2f%% student tickets.%n", studentTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidTickets);


    }

}