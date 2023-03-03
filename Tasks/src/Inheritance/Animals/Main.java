package Inheritance.Animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Puppy puppy = new Puppy();
        System.out.println();
        puppy.weep();
        puppy.bark();
        puppy.eat();
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
