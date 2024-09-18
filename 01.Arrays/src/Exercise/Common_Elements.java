package Exercise;

import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for(var element2 : second) {
            for (var element1 : first) {
                if (element2.equals(element1)) {
                    System.out.print(element1 + " ");
                }
            }
        }
    }
}
