package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int bookCount = 0;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {

            if (input.equals(bookName)) {
                break;
            }
            bookCount++;
            input = scanner.nextLine();
        }
        if (input.equals(bookName)) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}

