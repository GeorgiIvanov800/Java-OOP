package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }


    private void setName(String name) {
        Validation.validateName(name);
        this.name = name;
    }
    private void setMoney(double money) {
        Validation.validateMoney(money);
        this.money = money;
    }

    public void byeProduct() {
        throw  new IllegalArgumentException("TODO");
    }

    public String getName() {
        return this.name;
    }


}
