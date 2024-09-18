package Exercise;

import java.util.Scanner;

public class Smallest_of_Three_Numbers {
    public static void smallestNumber (int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (c < b && c < a) {
            System.out.println(c);
        }
        else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        smallestNumber(a, b, c);
    }
}
