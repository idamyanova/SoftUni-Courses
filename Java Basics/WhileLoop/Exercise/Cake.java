package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int totalPiecesOfCake = length * height;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int takenPieceOfCake = Integer.parseInt(input);
            totalPiecesOfCake -= takenPieceOfCake;
            if (totalPiecesOfCake <= 0) {
                break;
            }
                input = scanner.nextLine();
        }
        if (totalPiecesOfCake <= 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPiecesOfCake));
        }if (input.equals ("STOP")) {
            System.out.printf("%d pieces are left.", totalPiecesOfCake);
        }
    }
}
