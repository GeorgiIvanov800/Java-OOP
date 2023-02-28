package Encapsulation.ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    private void setCost(double cost) {
        throw  new IllegalArgumentException("TODO");
    }

    private void setName(String name) {
        throw  new IllegalArgumentException("TODO");
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
