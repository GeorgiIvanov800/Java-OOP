package Vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
    }

    @Override
    protected double getExtraFuelConsumption() {
        return 1.6;
    }

    @Override
    protected double calculateRefuelLitersAfterLoss(double liters) {
        return liters * 0.95;
    }
}
