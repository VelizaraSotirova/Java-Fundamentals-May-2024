package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int differencesIndex = 0, sum = 0;
        for(int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                sum += firstArray[i];
            } else {
                differencesIndex = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", differencesIndex);
                return;
            }
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
