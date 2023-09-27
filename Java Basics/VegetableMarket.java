package FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
        Double priceKgVegitables = Double.parseDouble(scanner.nextLine());
        Double priceKgFruits = Double.parseDouble(scanner.nextLine());
       int totalKgVegitables = Integer.parseInt(scanner.nextLine());
       int totalKgFruits = Integer.parseInt(scanner.nextLine());

       Double allVegitable = priceKgVegitables * totalKgVegitables;
       Double allFruits = priceKgFruits * totalKgFruits;

       Double vegetablesAndFruits = (allVegitable + allFruits) / 1.94;
       System.out.printf("%.2f", vegetablesAndFruits);




    }
}
