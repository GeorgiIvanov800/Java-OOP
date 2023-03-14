package WildFarm.Animal;

import WildFarm.Food;

public class Zebra extends Mammal {
    public Zebra(String name, double weight, String region) {
        super(name, weight, region);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {

    }
}
