package Lab;

import java.util.Scanner;

public class Math_Operations {
    private static int calculator (int a, String operator, int b) {
        int result = 0;

        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b != 0) {
                    result = a / b;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        int result = calculator(a, operator, b);
        System.out.println(result);
    }
}
