package Exercise;

import java.util.Scanner;

public class Palindrome_Integers {
    public static boolean isPalindrome(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return text.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (!text.equals("END")) {
            if (isPalindrome(text)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            text = scanner.nextLine();
        }
    }
}
