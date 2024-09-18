package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Append_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> texts = new ArrayList<>(Arrays.stream(input.split("\\|")).toList());
        Collections.reverse(texts);

        System.out.println(texts.toString() //"[3,  2 5 , 1 0,  4  5, 7 ]"
                .replace("[", "") //"3,  2 5 , 1 0,  4  5, 7 ]"
                .replace("]", "") //"3,  2 5 , 1 0,  4  5, 7 "
                .replaceAll(",", "") //"3  2 5  1 0  4  5 7 "
                .replaceAll("\\s+", " ") //"3 2 5 1 0 4 5 7 "
                .trim()); //"3 2 5 1 0 4 5 7"
    }
}
