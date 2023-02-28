package Encapsulation.ShoppingSpree;

public class Validation {
    public static void validateName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }


    public static void validateMoney(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
