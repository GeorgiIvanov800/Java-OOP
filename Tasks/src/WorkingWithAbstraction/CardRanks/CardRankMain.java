package WorkingWithAbstraction.CardRanks;

public class CardRankMain {
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
    public static void main(String[] args) {
        CardRanks[] values = CardRanks.values();
        System.out.println("Card Ranks:");

        for (CardRanks value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value);
        }
    }
}
