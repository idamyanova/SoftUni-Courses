package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daysInARow = 0;


        while (currentMoney < vacationPrice){
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            days++;
            if (action.equals ("save")) {
                currentMoney += sum;
                daysInARow = 0;
            }
            if (action.equals("spend")) {
                currentMoney -= sum;
                daysInARow++;
            }
                if (currentMoney < 0) {
                    currentMoney = 0;
            }
            if (daysInARow >=5){
                System.out.println ("You can't save the money.");
                System.out.printf("%d",days);
                break;
            }
            }
        if (vacationPrice <= currentMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
