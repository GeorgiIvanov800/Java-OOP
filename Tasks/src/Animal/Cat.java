package Animal;

import WildFarm.Food;

public class Cat extends Feline {
    private String breed;
    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {

    }
}
