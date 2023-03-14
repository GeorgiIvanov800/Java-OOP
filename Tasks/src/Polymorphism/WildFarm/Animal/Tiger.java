package Polymorphism.WildFarm.Animal;

import Polymorphism.WildFarm.Food;
import Polymorphism.WildFarm.Meat;

public class Tiger extends Feline {
    private String livingRegion;

    public Tiger(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Tiger);
        this.livingRegion = region;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Meat;
    }

    @Override
    public void eat(Food food) {

    }
}
