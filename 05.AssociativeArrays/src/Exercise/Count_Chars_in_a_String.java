package Exercise;

import java.util.*;

public class Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replace(" ", "");

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        char[] symbols = input.toCharArray();
        for (char symbol : symbols) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                int currentCount = symbolsCount.get(symbol); //текущ брой на срещаия
                symbolsCount.replace(symbol, currentCount, currentCount + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
