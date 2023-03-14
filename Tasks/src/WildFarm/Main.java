package WildFarm;

import WildFarm.Animal.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] animalParts = input.split("\\s+");

            Animal animal = createAnimal(animalParts);


        }
    }

    private static Animal createAnimal(String[] animalParts) {
        AnimalType type = AnimalType.valueOf(animalParts[0]);
        if (type == AnimalType.Cat) {
            return new Cat(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3], animalParts[4]);
        } else if (type == AnimalType.Mouse) {
            return new Mouse(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3]);
        } else if (type == AnimalType.Zebra) {
            return new Zebra(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3]);
        } else if (type == AnimalType.Tiger) {
            return new Tiger(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3]);
        }
        return null;
    }
}
