package Lab;

import java.util.Scanner;

public class Orders {
    public static void shopOrder (String product, int quantity) {
        switch (product) {
            case "coffee" -> System.out.printf("%.2f", quantity * 1.5);
            case "water" -> System.out.printf("%.2f", quantity * 1.0);
            case "coke" -> System.out.printf("%.2f", quantity * 1.4);
            case "snacks" -> System.out.printf("%.2f", quantity * 2.0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        shopOrder(product, quantity);
    }
}
