package Exercise;

import java.util.*;

public class Change_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        String input = sc.nextLine();

        while(!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Delete" -> {
                    int element = Integer.parseInt(tokens[1]);
                    numbers.removeAll(List.of(element));
                }
                case "Insert" -> {
                    int element = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);
                    numbers.add(position, element);
                }
            }

            input = sc.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
