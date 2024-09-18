package Exercise;

import java.util.*;

public class House_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] tokens = command.split(" ");
            String name = tokens[0];
            if (tokens[2].equals("going!")) {
                if(!names.contains(name)) {
                    names.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else if (tokens[2].equals("not")) {
                if(!names.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    names.remove(name);
                }
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
