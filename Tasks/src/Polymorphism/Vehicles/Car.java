package Polymorphism.Vehicles;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
    }

    @Override
    protected double getExtraFuelConsumption() {
        return 0.9;
    }
}
