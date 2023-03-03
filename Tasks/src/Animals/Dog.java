package Animals;

public class Dog extends  Animal {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
        this.sound = "Woof!";
    }

   // @Override
    // public String produceSound() {
    //  return "Woof!";
    //}
}
