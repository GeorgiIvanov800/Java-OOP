package Encapsulation.SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private  double salary;


     Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double salary) {
         this(firstName,lastName,age);
         this.salary = salary;
    }

    String getFirstName() {
        return this.firstName;
    }

    int getAge() {
        return this.age;
    }

    public void increaseSalary(double bonus) {
         double actualBonus = bonus;
         if (this.getAge() < 30) {
             actualBonus /= 2;
         }
         double newSalary = salary * (1 + actualBonus / 100);
         salary = newSalary;
    }

    @Override
    public String toString() {

        return String.format("%s %s is %d years old.",firstName, lastName, age);
    }
}
