package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double p1 = 00.00;
        double p2 = 00.00;
        double p3 = 00.00;
        double p4 = 00.00;
        double p5 = 00.00;

        for (int i = 1; i <= num; i++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value < 200) {
                p1++;
            } else if (value <= 399) {
                p2++;
            } else if (value <= 599) {
                p3++;
            } else if (value <= 799) {
                p4++;
            } else {
                p5++;
            }
        }
        p1 = p1 / num * 100;
        p2 = p2 / num * 100;
        p3 = p3 / num * 100;
        p4 = p4 / num * 100;
        p5 = p5 / num * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);

    }
}

