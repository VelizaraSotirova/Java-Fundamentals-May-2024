package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Gauss_Trick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());

        int size = numbers.size();

        for (int i = 0; i < size / 2; i++) {
            numbers.set(i, numbers.get(i) + numbers.getLast());
            numbers.removeLast();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
