package Vehicles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final String CAR_NAME = "Car";
    public static final String TRUCK_NAME = "Truck";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carInfo = scanner.nextLine();
        String truckInfo = scanner.nextLine();

        Map<String, Vehicle> vehiclesByName = new LinkedHashMap<>();

        vehiclesByName.put(CAR_NAME,new Car());
        vehiclesByName.put(TRUCK_NAME,new Truck());

        int numCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCommands; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            String operation = commandParts[0];
            String vehicleName = commandParts[1];
            Vehicle vehicle = vehiclesByName.get(vehicleName);

            switch (operation) {
                case "Drive":
                    boolean successfulDrive = vehicle.drive(Double.parseDouble(commandParts[2]));
                    if (successfulDrive) {
                        System.out.printf("");
                    } else {
                        System.out.println(vehicleName + " needs refueling");
                    }
                    break;
                case "Refuel":
                    vehicle.refuel(Double.parseDouble(commandParts[2]));
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + operation);
            }
        }

        System.out.println(String.format("Car: %.2f", vehiclesByName.get(CAR_NAME).getFuelQuantity()));
        System.out.println(String.format("Truck: %.2f", vehiclesByName.get(TRUCK_NAME).getFuelQuantity()));
    }
}
