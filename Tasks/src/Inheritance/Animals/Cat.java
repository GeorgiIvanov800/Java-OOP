package Inheritance.Animals;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void meow() {
        System.out.println("meow....");
    }
}
