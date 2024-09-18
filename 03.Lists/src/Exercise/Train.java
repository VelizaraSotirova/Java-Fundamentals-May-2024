package Exercise;

import java.util.*;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());

        int maxCapacityOfPassengersInEachWagon = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        while(!input.equals("end")) {
            String[] tokens = input.split(" ");
            if(Objects.equals(tokens[0], "Add")) {
                int passengersInNewWagon = Integer.parseInt(tokens[1]);
                wagons.add(passengersInNewWagon);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for(int wagon = 0; wagon < wagons.size(); wagon++) {
                    int currentPassengers = wagons.get(wagon);
                    if(currentPassengers + passengers <= maxCapacityOfPassengersInEachWagon) {
                        wagons.set(wagon, currentPassengers + passengers);
                        break;
                    }
                }
            }
            input = sc.nextLine();
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
