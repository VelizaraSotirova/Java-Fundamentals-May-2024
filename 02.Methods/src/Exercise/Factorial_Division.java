package Exercise;

import java.util.Scanner;

public class Factorial_Division {
    public static int firstNumberFactorial (int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int secondNumberFactorial (int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static double factorialsDivision (int a, int b) {
        int firstFactorial = firstNumberFactorial(a);
        int secondFactorial = secondNumberFactorial(b);

        return (double) firstFactorial / secondFactorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        double result = factorialsDivision(a, b);
        System.out.printf("%.2f", result);
    }
}
