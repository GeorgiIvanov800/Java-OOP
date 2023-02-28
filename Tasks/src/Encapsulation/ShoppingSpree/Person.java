package Encapsulation.ShoppingSpree;

import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        throw  new IllegalArgumentException("TODO");
    }

    private void setName() {
        throw  new IllegalArgumentException("TODO");
    }
    private void setMoney() {
        throw  new IllegalArgumentException("TODO");
    }

    public void byeProduct() {
        throw  new IllegalArgumentException("TODO");
    }

    public String getName() {
        return this.name;
    }


}
