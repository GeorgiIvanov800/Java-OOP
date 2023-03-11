package Inheritance.Animals;

public class Animal {
    String name;
    int age;
    String gender;
    String sound;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("eating...");
    }
}
