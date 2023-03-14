package Animal;

import WildFarm.Food;

public abstract class Animal {
    private String name;
    private String type;
    private Double weight;
    private Integer foodEaten;


    public abstract void makeSound();
    public abstract void eat(Food food);
}
