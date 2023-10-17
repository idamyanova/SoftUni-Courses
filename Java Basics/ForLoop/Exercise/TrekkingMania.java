package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//· На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//
//· За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]

        int groupNumber = Integer.parseInt(scanner.nextLine());
        double Musalla = 0.00;
        double Monblant = 0.00;
        double Kilimandzharo = 0.00;
        double K2 = 0.00;
        double Everest = 0.00;
        int totalPeople = 0;

        for (int value = 1; value <= groupNumber; value++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;

            if (peopleInGroup <= 5) {
                Musalla += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                Monblant += peopleInGroup;;
            } else if (peopleInGroup <= 25) {
                Kilimandzharo += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                K2 += peopleInGroup;;
            } else {
                Everest+= peopleInGroup;;
            }
        }
            Musalla = (Musalla/totalPeople) * 100;
            Monblant= (Monblant/totalPeople) * 100;
            Kilimandzharo= (Kilimandzharo/totalPeople) * 100;
            K2= (K2/totalPeople) * 100;
            Everest= (Everest/totalPeople) * 100;

            System.out.printf("%.2f%%%n", Musalla);
            System.out.printf("%.2f%%%n", Monblant);
            System.out.printf("%.2f%%%n", Kilimandzharo);
            System.out.printf("%.2f%%%n", K2);
            System.out.printf("%.2f%%%n", Everest);
        }


    }

