package Vehicles;

public abstract class Vehicle {
    double fuelQuantity;
    double fuelConsumption;
    public abstract boolean drive(double distance);
    public abstract void refuel(double liters);
    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

}
