package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BigInteger number = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            number = number.multiply(BigInteger
                    .valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(number);
    }
}
