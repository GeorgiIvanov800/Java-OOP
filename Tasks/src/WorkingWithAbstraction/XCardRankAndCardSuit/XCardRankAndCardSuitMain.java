package WorkingWithAbstraction.XCardRankAndCardSuit;

import java.util.Scanner;

public class XCardRankAndCardSuitMain {
    enum CardSuits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    enum CardRanks {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    static <E extends Enum<E>> void printEnumOrdinalsAndNames(Enum<E>[] values) {
        for (Enum<E> value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value);
        }

    }
    public static void main(String[] args) {
        String command = new Scanner(System.in).nextLine();

        if (command.equals("Card Ranks")) {
            printEnumOrdinalsAndNames(CardRanks.values());
        } else if (command.equals("Card Suits")) {
            printEnumOrdinalsAndNames(CardSuits.values());
        }

    }
}
