package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]

        Double priceMackerel = Double.parseDouble(scanner.nextLine());
        Double priceSprinkle = Double.parseDouble(scanner.nextLine());
        Double priceBonito = Double.parseDouble(scanner.nextLine());
        Double priceSafrid = Double.parseDouble(scanner.nextLine());
        int priceMussels = Integer.parseInt(scanner.nextLine());

        

    }
}
