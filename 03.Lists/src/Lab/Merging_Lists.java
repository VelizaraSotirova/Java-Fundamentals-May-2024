package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Merging_Lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> first = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());
        List<Integer> second = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());
        List<Integer> resultList = new ArrayList<>();

        int firstListSize = first.size();
        int secondListSize = second.size();

        int index = 0;

        if (firstListSize >= secondListSize) {
            for (int i = 0; i < secondListSize; i++) {
                resultList.add(first.get(i));
                index++;
                resultList.add(second.get(i));
            }
            for (int j = index; j < firstListSize; j++) {
                resultList.add(first.get(j));
            }
        } else {
            for (int i = 0; i < firstListSize; i++) {
                resultList.add(first.get(i));
                index++;
                resultList.add(second.get(i));
            }
            for (int j = index; j < secondListSize; j++) {
                resultList.add(second.get(j));
            }
        }

        for (int num : resultList) {
            System.out.print(num + " ");
        }
    }
}
