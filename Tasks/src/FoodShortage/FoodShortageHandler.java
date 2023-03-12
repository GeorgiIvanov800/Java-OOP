package FoodShortage;

import java.util.ArrayList;
import java.util.List;

public class FoodShortageHandler extends CommandHandler {
    private final List<BuyingPerson> buyingPeople;
    public FoodShortageHandler(String endCommand) {
        super(endCommand);
        this.buyingPeople = new ArrayList<>();
    }

    @Override
    protected void processNonEndCommand(String command) {

    }
}
