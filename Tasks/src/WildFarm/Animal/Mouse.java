package WildFarm.Animal;

import WildFarm.Food;

public class Mouse extends Mammal {
    public Mouse(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Mouse);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return true;
    }

    @Override
    public void eat(Food food) {

    }
}
