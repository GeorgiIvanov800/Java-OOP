package FoodShortage;

public class Citizen extends BuyingPerson implements Identifiable {
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name , age);
        this.id = id;
        this.birthDate = birthDate;
    }



    @Override
    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

}
