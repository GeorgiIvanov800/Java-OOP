package WildFarm.Animal;

public abstract class Mammal extends Animal {
    private String livingRegion;


    public Mammal(String name, double weight, String region) {
        super(name, weight);
        this.livingRegion = region;
    }
}
