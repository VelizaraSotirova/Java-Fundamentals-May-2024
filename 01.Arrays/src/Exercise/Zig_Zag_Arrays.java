package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] numberArray = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int firstNumber = numberArray[0];
            int secondNumber = numberArray[1];

            if (i % 2 != 0) {
                first[i - 1] = firstNumber;
                second[i - 1] = secondNumber;
            } else {
                second[i - 1] = firstNumber;
                first[i - 1] = secondNumber;
            }
        }

        //Printing with for-loop
        for (int position = 0; position < first.length; position++) {
            System.out.print(first[position] + " ");
        }
        //Printing new line
        System.out.println();
        //Printing with foreach-loop
        for(int number : second) {
            System.out.print(number + " ");
        }
    }
}
