package FoodShortage;

public abstract class BuyingPerson implements Person, Buyer {
    private String name;
    private int age;
    private int food;

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
