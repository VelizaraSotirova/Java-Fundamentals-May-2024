package Lab;

import java.util.Scanner;

public class Repeat_String {
    private static String repeatString(String text, int n) {
        return String.valueOf(text).repeat(Math.max(0, n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text, n);
        System.out.println(result);
    }
}
