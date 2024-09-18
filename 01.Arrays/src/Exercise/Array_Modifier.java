package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Modifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            //1. command == "swap" -> "swap 1 3"
            if(command.contains("swap")) {
                //Take the positions we will swap
                int firstPosition = Integer.parseInt(command.split(" ")[1]);
                int secondPosition = Integer.parseInt(command.split(" ")[2]);
                //Take the numbers of the positions we will swap
                int firstNumber = numbers[firstPosition];
                int secondNumber = numbers[secondPosition];
                //Swap the numbers
                numbers[firstPosition] = secondNumber;
                numbers[secondPosition] = firstNumber;
            }
            //2. command == "multiply" -> "multiply 2 4"
            else if (command.contains("multiply")) {
                //Take the positions we will multiply
                int firstPosition = Integer.parseInt(command.split(" ")[1]);
                int secondPosition = Integer.parseInt(command.split(" ")[2]);
                //Take the numbers of the positions we will multiply
                int firstNumber = numbers[firstPosition];
                int secondNumber = numbers[secondPosition];
                //Multiply the numbers
               int product = firstNumber * secondNumber;
               numbers[firstPosition] = product;
            }
            //3. command == "decrease"
            else if (command.equals("decrease")) {
                //Decreasing all elements with 1
                for (int position = 0; position < numbers.length; position++) {
                    numbers[position]--;
                }
            }

            command = scanner.nextLine();
        }

        for (int position = 0; position <= numbers.length - 1; position++) {
            int currentNumber = numbers[position];
            if (position != numbers.length - 1) {
                //The number is not last
                System.out.print(currentNumber + ", ");
            } else {
                System.out.print(currentNumber);
            }
        }
    }
}
