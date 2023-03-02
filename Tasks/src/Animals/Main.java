package Animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Puppy puppy = new Puppy();

        puppy.bark();
        puppy.eat();
        puppy.weep();
    }
}
