package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Top_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= numbers.length; i++) {
            // The last integer is always top integer
            if(i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }

            int currentNumber = numbers[i];
            boolean isTop = true;

            // Check if the next number is bigger or smaller than the current number
            for (int j = i + 1; j < numbers.length; j++) {
                int nextNumber = numbers[j];
                if (currentNumber <= nextNumber) {
                    // If current number is smaller than the next number => it is not a top integer
                    isTop = false;
                    break;
                }
            }

            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
