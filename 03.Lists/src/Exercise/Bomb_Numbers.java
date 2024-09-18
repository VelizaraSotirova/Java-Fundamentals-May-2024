package Exercise;
import java.util.*;

public class Bomb_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());
        String input = sc.nextLine();
        int bombNumber = Integer.parseInt(input.split(" ")[0]);
        int power = Integer.parseInt(input.split(" ")[1]);

        while (numbers.contains(bombNumber)) {
            int bombPosition = numbers.indexOf(bombNumber);
            int startPosition = Math.max(0, bombPosition - power);
            int endPosition = Math.min(numbers.size() - 1, bombPosition + power);

            for (int i = endPosition; i >= startPosition; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println(sum);
    }
}
