package Lab;

import java.util.Scanner;

public class Greater_of_Two_Values {
    public static int getMax (int firstNum,int secondNum) {
        return Math.max (firstNum,secondNum);
    }

    public static char getMax (char firstChar,char secondChar) {
        if (firstChar >= secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    public static String getMax (String first,String second) {
        if (first.compareTo (second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String  type    = scanner.nextLine ();
        String  a       = scanner.nextLine ();
        String  b       = scanner.nextLine ();
        switch (type) {
            case "int":
                System.out.println (getMax (Integer.parseInt (a),Integer.parseInt (b)));
                break;
            case "char":
                System.out.println (getMax (a.charAt (0),b.charAt (0)));
                break;
            case "string":
                System.out.println (getMax (a,b));
                break;
        }
    }
}
