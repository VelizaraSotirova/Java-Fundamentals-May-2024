package Lab;

import java.util.Scanner;

public class Math_Power {
    private static int mathPower (int number, int power) {
        return (int) Math.pow(number, power);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        int result = mathPower(number, power);
        System.out.println(result);
    }
}
