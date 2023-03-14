package WildFarm.Animal;

import WildFarm.Food;

public class Tiger extends Feline {
    private String livingRegion;

    public Tiger(String name, double weight, String region) {
        super(name, weight, region);
        this.livingRegion = region;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {

    }
}
