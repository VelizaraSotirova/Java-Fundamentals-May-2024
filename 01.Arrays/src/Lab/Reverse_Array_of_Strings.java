package Lab;

import java.util.Scanner;

public class Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            String oldWord = words[i];
            words[i] = words[words.length - 1- i];
            words[words.length - 1 - i] = oldWord;
        }
        System.out.println(String.join(" ", words));
    }
}
