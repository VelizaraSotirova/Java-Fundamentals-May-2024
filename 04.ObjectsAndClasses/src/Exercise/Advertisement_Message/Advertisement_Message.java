package Exercise.Advertisement_Message;

import java.util.Scanner;

public class Advertisement_Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Random_Message message = new Random_Message();

        for (int i = 0; i < n; i++) {
            String randomMsg = message.randomMessage();
            System.out.println(randomMsg);
        }
    }
}
