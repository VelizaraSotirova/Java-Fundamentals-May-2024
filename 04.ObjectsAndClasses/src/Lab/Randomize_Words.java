package Lab;

import java.util.Random;
import java.util.Scanner;

public class Randomize_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        Random rnd = new Random();
        for(int i = 0; i < words.length; i++) {
            int position = rnd.nextInt(words.length);
            i = position;
        }
        System.out.println(String.join(
                System.lineSeparator(), words
        ));
    }
}
