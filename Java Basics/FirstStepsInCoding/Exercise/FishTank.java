package FirstStepsInCoding.Exersice;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Дължина в см – цяло число в интервала [10 … 500]
        //2. Широчина в см – цяло число в интервала [10 … 300]
        //3. Височина в см – цяло число в интервала [10… 200]
        //4. Процент – реално число в интервала [0.000 … 100.000]

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height= Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine()) / 100;
        double aquariumVolumeCm = lenght * width * height;
        double aquariumVolumeLitre = aquariumVolumeCm * 0.001;

System.out.println(aquariumVolumeLitre * (1-percent));




    }
}
