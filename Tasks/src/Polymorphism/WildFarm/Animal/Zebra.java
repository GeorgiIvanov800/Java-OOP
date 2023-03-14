package Polymorphism.WildFarm.Animal;

import Polymorphism.WildFarm.Food;
import Polymorphism.WildFarm.Vegetable;

public class Zebra extends Mammal {
    public Zebra(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Zebra);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Vegetable;
    }

    @Override
    public void eat(Food food) {

    }
}
