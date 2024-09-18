package Exercise;

import java.util.Scanner;

public class Password_Validator {
    private static boolean isValidLength (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isValidContent (String password) {
        for (char symbol : password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return  true;
    }

    private static boolean isValidCountDigits (String password) {
        int countDigits = 0;
        for(char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return  countDigits >= 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(password)) {
            System.out.println("Password must consists only of letters and digits");
        }
        if (!isValidCountDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength(password) && isValidContent(password) && isValidCountDigits(password)) {
            System.out.println("Password is valid");
        }
    }
}
