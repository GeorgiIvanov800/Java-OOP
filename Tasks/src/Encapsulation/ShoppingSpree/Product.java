package Encapsulation.ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setCost(double cost) {
        Validation.validateMoney(cost);
        this.cost = cost;
    }

    private void setName(String name) {
        Validation.validateName(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
