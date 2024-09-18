package Lab;

import java.util.Scanner;

public class Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Calculate the product of the sum of even and odd digits
        int result = multiplySumOfEvensBySumOfOdds(Math.abs(number));

        System.out.println(result);
    }

    public static int multiplySumOfEvensBySumOfOdds(int number) {
        int sumEvens = 0;
        int sumOdds = 0;

        // Loop through each digit
        while (number > 0) {
            int digit = number % 10;

            // Check if digit is even or odd and add to respective sum
            if (digit % 2 == 0) {
                sumEvens += digit;
            } else {
                sumOdds += digit;
            }

            // Remove the last digit
            number /= 10;
        }

        // Multiply the sums
        return sumEvens * sumOdds;
    }
}
