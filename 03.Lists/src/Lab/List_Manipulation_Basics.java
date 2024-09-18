package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class List_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .toList());

        String command = sc.nextLine();
        while(!command.equals("end")) {
            String[] tokens = command.split(" ");
            String action = tokens[0];
            switch (action) {
                case "Add" -> {
                    int elementToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(elementToAdd);
                }
                case "Remove" -> {
                    int elementToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(elementToRemove));
                }
                case "RemoveAt" -> {
                    int elementToRemoveAt = Integer.parseInt(tokens[1]);
                    numbers.remove(elementToRemoveAt);
                }
                case "Insert" -> {
                    int elementToInsert = Integer.parseInt(tokens[1]);
                    int positionToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(positionToInsert, elementToInsert);
                }
            }

            command = sc.nextLine();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
