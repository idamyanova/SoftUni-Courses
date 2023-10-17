package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Име на актьора - текст
        //• Точки от академията - реално число в интервала [2.0... 450.5
        //• Брой оценяващи n - цяло число в интервала[1… 20]
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int numberJury = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        totalPoints += pointsAcademy;

        for (int i = 0; i < numberJury; i++) {
            String nameJury = scanner.nextLine();
            double pointsJury = Double.parseDouble(scanner.nextLine());

            totalPoints += (nameJury.length() * pointsJury) / 2;

            if (totalPoints > 1250.5){
                System.out.printf ("Congratulations, %s got a nominee for leading role with %.1f!", nameActor,totalPoints);
                    return;}
            }
            System.out.printf ("Sorry, %s you need %.1f more!", nameActor, (1250.5 - totalPoints));
        }
        }


