package Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read an array
        double[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        //Create the map
        TreeMap<Double, Integer> counts = new TreeMap<>();
        //Check if the value is in the map and increase the value of it
        for (double number : numbers) {
            if(!counts.containsKey(number)) {
                counts.put(number, 0);
            }
            counts.put(number, counts.get(number) + 1);
        }

        //For each entry int the Map we print the information int the given format
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
