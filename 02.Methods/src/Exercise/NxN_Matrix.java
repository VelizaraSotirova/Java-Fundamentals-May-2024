package Exercise;

import java.util.Scanner;

public class NxN_Matrix {
    public static void printNxNMatrix (int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(n +  " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printNxNMatrix(n);
    }
}
