package Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken() {

    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age >= 5) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

        this.age = age;
    }
}
