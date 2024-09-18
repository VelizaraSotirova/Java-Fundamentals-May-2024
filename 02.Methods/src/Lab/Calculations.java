package Lab;

import java.util.Scanner;

public class Calculations {
    public static void calculator(String command, int a, int b) {
        switch (command) {
            case "add" -> System.out.println(a + b);
            case "multiply" -> System.out.println(a * b);
            case "subtract" -> System.out.println(a - b);
            case "divide" -> System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        calculator(command, num1, num2);
    }
}
