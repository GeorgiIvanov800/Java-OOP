package Inheritance.Animals;

public class Puppy extends Dog {
    public Puppy(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void weep() {
        System.out.println("weeping...");
    }
}
