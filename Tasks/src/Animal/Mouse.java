package Animal;

import WildFarm.Food;

public class Mouse extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {

    }
}
