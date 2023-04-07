 package Encapsulation.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                String errorMessage = String.format("Cannot place {name of invalid argument} on top of your pizza.", toppingType);
                throw new IllegalArgumentException(errorMessage);
        }
        //this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String errorMessage = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public double calculateCalories() {
        return 0;
    }
}
