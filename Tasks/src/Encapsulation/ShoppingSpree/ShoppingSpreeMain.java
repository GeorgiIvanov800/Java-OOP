package Encapsulation.ShoppingSpree;

public class ShoppingSpreeMain {
    public static void main(String[] args) {
        Product bread = new Product("Bread", 10);

        Person p = new Person("Georgi", 8);

        System.out.println(p.getName());

        p.byeProduct(bread);
        System.out.println();
    }
}
