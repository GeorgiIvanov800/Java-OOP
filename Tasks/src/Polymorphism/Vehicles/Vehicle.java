package Polymorphism.Vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = litersPerKm;
    }

    public Double drive(double distance) {
        double fuelRequired = distance * (fuelConsumption + getExtraFuelConsumption());
        if (fuelRequired > fuelQuantity) {
            return null;
        }

        fuelQuantity -= fuelRequired;
        return distance;
    }

    protected abstract double getExtraFuelConsumption();

    public void refuel(double liters) {
        this.fuelQuantity += calculateRefuelLitersAfterLoss(liters);
    }

    protected double calculateRefuelLitersAfterLoss(double liters) {
        return liters;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

}
