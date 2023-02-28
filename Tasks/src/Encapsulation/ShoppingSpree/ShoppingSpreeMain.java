package Encapsulation.ShoppingSpree;

public class ShoppingSpreeMain {
    public static void main(String[] args) {
        Product product = new Product("   ",1);
        Product bread = new Product("milk", 2);

        System.out.println(bread.getName());
        System.out.println(product.getCost());
    }
}
