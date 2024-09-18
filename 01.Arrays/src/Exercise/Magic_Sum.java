package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            for (int next = i + 1; next < numbers.length; next++) {
                int nextNumber = numbers[next];
                int sum = nextNumber + currentNumber;
                if (sum == magicSum) {
                    System.out.print(currentNumber + " " + nextNumber + "\n");
                    break;
                }
            }
        }
    }
}
