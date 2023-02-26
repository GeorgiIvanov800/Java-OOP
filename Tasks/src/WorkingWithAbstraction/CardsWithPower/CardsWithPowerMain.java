package WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class CardsWithPowerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rankString = scanner.nextLine();
        String suitString = scanner.nextLine();

        Card.Rank rank = Card.Rank.valueOf(rankString);
        Card.Suit suit = Card.Suit.valueOf(suitString);
        Card card = new Card(rank, suit);

        System.out.println("Card name: " + card.getName() + "; Card power: " + card.getPower());
    }

}
