package ConditionalStatements.If.Basic.Veronika;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double speed = Double.parseDouble(scanner.next());
        //•	При скорост до 10 (включително) отпечатайте "slow"
        //•	При скорост над 10 и до 50 (включително) отпечатайте "average"
        //•	При скорост над 50 и до 150 (включително) отпечатайте "fast"
        //•	При скорост над 150 и до 1000 (включително) отпечатайте "ultra fast"
        //•	При по-висока скорост отпечатайте "extremely fast"
        if (speed <= 10) {
            System.out.print("slow");
        }
        else if (speed <= 50) {
            System.out.print("average");
        }
            else if (speed <= 150) {
            System.out.print("fast");
        }
                else if (speed <= 1000) {
            System.out.print("ultra fast");
        }
        else {
            System.out.print("extremely fast");

        }
    }
}
