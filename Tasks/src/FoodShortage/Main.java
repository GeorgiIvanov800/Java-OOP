package FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BuyingPerson> buyingPeople = new ArrayList<>();

        int numPeople = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numPeople; i++) {
            String paramsString = scanner.nextLine();
            String[] personParams = paramsString.split("\\s+");

            switch (personParams.length) {
                case 3:
                    Rebel rebel = new Rebel(personParams[0], Integer.parseInt(personParams[1]), personParams[2]);
                    buyingPeople.add(rebel);
                    break;
                case 4:
                    Citizen citizen = new Citizen(personParams[0], Integer.parseInt(personParams[1]), personParams[2], personParams[3]);
                   buyingPeople.add(citizen);
                    break;
                default:
                    throw new IllegalStateException("Unknown input " + paramsString);
            }
        }
        FoodShortageHandler handler = new FoodShortageHandler(buyingPeople, "End");

        handler.readAndHandleCommandsToEnd(scanner);

        System.out.println(buyingPeople.stream()
                .mapToInt(BuyingPerson::getFood).sum());


    }
}
