package Exercise;

import java.util.*;

public class List_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());

        String input = sc.nextLine();
        while(!input.equals("End")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Add" -> {
                    int number = Integer.parseInt(tokens[1]);
                    numbers.add(number);
                }
                case "Insert" -> {
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, number);
                    }  else {
                        System.out.println("Invalid index!");
                    }
                }
                case "Remove" -> {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index!");
                    }
                }
                case "Shift" -> {
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (direction.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            int firstNumber = numbers.getFirst();
                            numbers.removeFirst();
                            numbers.add(firstNumber);
                        }
                    } else if (direction.equals("right")){
                        for (int i = 1; i <= count; i++) {
                            int lastNumber = numbers.getLast();
                            numbers.removeLast();
                            numbers.addFirst(lastNumber);
                        }
                    }
                }
            }

            input = sc.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
