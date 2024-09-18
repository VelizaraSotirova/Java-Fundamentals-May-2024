package Exercise;

import java.util.Scanner;

public class Vowels_Count {
    public static int vowelsCount (char[] text) {
        int vowelsCount = 0;
        for (var letter : text) {
            switch (letter)  {
                case 'o', 'u', 'a', 'i', 'e' -> vowelsCount++;
                case 'O', 'U', 'A', 'I', 'E' -> vowelsCount++;
            }
        }

        return vowelsCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();
        System.out.println(vowelsCount(text));
    }
}
