package Exercise.Vehicle_Catalogue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            if (type.equals("car")) {
                cars.add(vehicle);
            } else if (type.equals("truck")){
                trucks.add(vehicle);
            }

            input = sc.nextLine();
        }

        String vehicleModel = sc.nextLine();
        double averageCarHorsepower = 0;
        double averageTruckHorsepower = 0;
        int carsCount = 0;
        int trucksCount = 0;
        while (!vehicleModel.equals("Close the Catalogue")) {
            for (var vehicle : cars) {
                if(vehicle.getVehicleModel().equals(vehicleModel)) {
                    carsCount++;
                    averageCarHorsepower += vehicle.getVehicleHorsepower();
                    System.out.printf("Type: %s%n", vehicle.getVehicleType());
                    System.out.printf("Model: %s%n", vehicle.getVehicleModel());
                    System.out.printf("Color: %s%n", vehicle.getVehicleColor());
                    System.out.printf("Horsepower: %d%n", vehicle.getVehicleHorsepower());
                }
            }

            for (var vehicle : trucks) {
                if(vehicle.getVehicleModel().equals(vehicleModel)) {
                    trucksCount++;
                    averageTruckHorsepower += vehicle.getVehicleHorsepower();
                    System.out.printf("Type: %s%n", vehicle.getVehicleType());
                    System.out.printf("Model: %s%n", vehicle.getVehicleModel());
                    System.out.printf("Color: %s%n", vehicle.getVehicleColor());
                    System.out.printf("Horsepower: %d%n", vehicle.getVehicleHorsepower());
                }
            }

            vehicleModel = sc.nextLine();
        }

        double averageCars = averageCarHorsepower / carsCount;
        if (carsCount == 0) {
            averageCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);

        double averageTrucks = averageTruckHorsepower / trucksCount;
        if (trucksCount == 0) {
            averageTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);
    }
}
