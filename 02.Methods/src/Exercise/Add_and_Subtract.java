package Exercise;

import java.util.Scanner;

public class Add_and_Subtract {
    public static int subtractThirdIntegerFromTheSum (int a, int b, int c) {
        int sum = sumFirstTwoIntegers(a, b);
        return sum - c;
    }

    public static int sumFirstTwoIntegers (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int result = subtractThirdIntegerFromTheSum(a, b, c);
        System.out.println(result);
    }
}
