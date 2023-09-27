package ConditionalStatements.Advanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;

        //· Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //· Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
        //· Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //· Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //· Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20
        switch (flower){
            case "Roses":
                if (numFlowers > 80){
                    price = 5.00 - (5.00 * 0.10);
                }else {
                    price = 5.00;
                }
                break;
            case "Dahlias":
                if (numFlowers > 90){
                    price = 3.80 - (3.80 * 0.15);
                }else {
            price = 3.80;
        }
                break;
            case "Tulips":
                if (numFlowers > 80){
                    price = 2.80 - (2.80 * 0.15);
                }else {
            price = 2.80;
        }
                break;
            case "Narcissus":
                if (numFlowers < 120){
                    price = 3 * 1.15;
                }else {
            price = 3;
        }
                break;
            case "Gladiolus":
                if (numFlowers < 80){
                    price = 2.50 * 1.20;
                }else {
            price = 2.50;
        }
                break;
        }
        totalPrice = numFlowers * price;

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flower, (budget - totalPrice));
        }else {System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }

    }
}
