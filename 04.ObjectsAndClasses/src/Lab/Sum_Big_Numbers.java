package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        BigInteger sum = a.add(b);

        System.out.println(sum);
    }
}
