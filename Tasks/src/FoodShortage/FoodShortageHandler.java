package FoodShortage;

import java.util.ArrayList;
import java.util.List;

public class FoodShortageHandler extends CommandHandler {
    private final List<BuyingPerson> buyingPeople;
    public FoodShortageHandler(List<BuyingPerson> buyingPeople, String endCommand) {
        super(endCommand);
        this.buyingPeople = new ArrayList<>();
    }

    @Override
    protected void processNonEndCommand(String name) {
        BuyingPerson targetPerson = findBuyingPerson(name);
        if (targetPerson != null) {
            targetPerson.buyFood();
        }
    }


    private BuyingPerson findBuyingPerson(String name) {
        for (BuyingPerson person : buyingPeople) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
