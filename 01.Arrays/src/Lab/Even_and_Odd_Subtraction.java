package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
