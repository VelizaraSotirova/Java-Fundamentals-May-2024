package Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] people = new int[wagons];
        for (int i =0 ; i < wagons; i++) {
            int peopleCountPerWagon = Integer.parseInt(scanner.nextLine());
            people[i] = peopleCountPerWagon;
            sum += peopleCountPerWagon;
        }

        for (int peoplePerWagon : people) {
            System.out.print(peoplePerWagon + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
