package Lab;

import java.util.*;

public class Word_Synonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<String>> wordsSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            wordsSynonyms.putIfAbsent(word, new ArrayList<>());
            wordsSynonyms.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordsSynonyms.entrySet()) {
            String currentWord = entry.getKey();
            List<String> synonymsOfCurrentWord = entry.getValue();

            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsOfCurrentWord));
        }
    }
}
