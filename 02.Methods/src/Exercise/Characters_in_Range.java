package Exercise;

import java.util.Scanner;

public class Characters_in_Range {
    public static void printCharactersInRange (char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol) {
            for (int ascii = firstSymbol + 1; ascii < secondSymbol; ascii++) {
                System.out.print((char)ascii + " ");
            }
        } else {
            for (char symbol = (char)(secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        printCharactersInRange(firstSymbol, secondSymbol);
    }
}
