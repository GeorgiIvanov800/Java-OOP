package Inheritance.Animals;

public class Tomcat extends Cat {
    public Tomcat(String name, int age) {
        super(name, age, "Male");
        this.sound = "MEOW";
    }
}
