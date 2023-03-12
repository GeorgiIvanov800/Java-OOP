package InterfacesAndAbstraction.FoodShortage;

public abstract class BuyingPerson implements Person, Buyer {
    private String name;
    private int age;
    protected int food;

    public BuyingPerson(String name, int age) {
        this.name = name;
        this.age = age;
        this.food = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getFood() {
        return this.food;
    }

    public abstract void buyFood();

}
