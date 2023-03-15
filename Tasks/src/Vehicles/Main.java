package Vehicles;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final String CAR_NAME = "Car";
    public static final String TRUCK_NAME = "Truck";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        String[] carInfoParams = scanner.nextLine().split("\\s+");
        String[] truckInfoParams = scanner.nextLine().split("\\s+");

        Map<String, Vehicle> vehiclesByName = new LinkedHashMap<>();
        vehiclesByName.put(CAR_NAME, new Car(Double.parseDouble(carInfoParams[1]), Double.parseDouble(carInfoParams[2])));
        vehiclesByName.put(TRUCK_NAME, new Truck(Double.parseDouble(truckInfoParams[1]), Double.parseDouble(truckInfoParams[2])));

        int numCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCommands; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            String operation = commandParts[0];
            String vehicleName = commandParts[1];
            Vehicle vehicle = vehiclesByName.get(vehicleName);

            switch (operation) {
                case "Drive":
                    Double travelledKm = vehicle.drive(Double.parseDouble(commandParts[2]));
                    if (travelledKm != null) {
                        System.out.println(vehicleName + " travelled " + decimalFormat.format(travelledKm) + " km");
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

        System.out.println("Car: " + String.format("%.2f", vehiclesByName.get(CAR_NAME).getFuelQuantity()));
        System.out.println("Truck: " + String.format("%.2f", vehiclesByName.get(TRUCK_NAME).getFuelQuantity()));
    }
}
