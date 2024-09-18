package Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        String productData = scanner.nextLine();

        while (!productData.equals("buy")) {
            String productName = productData.split(" ")[0]; //име на продукта
            double price = Double.parseDouble(productData.split(" ")[1]); //ед. цена на продукта
            int quantity = Integer.parseInt(productData.split(" ")[2]); //количество на продукта

            if (!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, quantity);
            } else {
                int currentQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, currentQuantity + quantity);
            }

            productsPrice.put(productName, price);

            productData = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}
