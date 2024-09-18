package Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Odd_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        LinkedHashMap<String,Integer> wordsCount = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if(wordsCount.containsKey(wordInLowerCase)) {
                wordsCount.put(wordInLowerCase, wordsCount.get(wordInLowerCase) + 1);
            } else {
                wordsCount.put(wordInLowerCase, 1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
