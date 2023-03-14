package Polymorphism.WildFarm.Animal;

import Polymorphism.WildFarm.Food;

public abstract class Animal {
    private String name;
    private String type;
    private Double weight;
    private Integer foodEaten;

    public Animal(String name, double weight, AnimalType type) {
        this.name = name;
        this.weight = weight;
        this.foodEaten = 0;
        this.type = type;

    }


    public abstract void makeSound();
    public abstract boolean willEatFood(Food food);
    public  void eat(Food food) {

        if(!willEatFood(food)) {
            System.out.printf("%s are not eating this type of food!", this.type);
            return;
        }

        this.foodEaten += food.getQuantity();

    }

    protected String getName() {
        return name;
    }

    protected String getType() {
        return type;
    }

    protected Double getWeight() {
        return weight;
    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }
}
