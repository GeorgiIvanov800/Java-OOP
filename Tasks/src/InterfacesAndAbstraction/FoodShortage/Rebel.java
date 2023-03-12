package InterfacesAndAbstraction.FoodShortage;

public class Rebel extends BuyingPerson implements Buyer { private String group;


    public Rebel(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }
    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {
    this.food += 5;
    }

}
