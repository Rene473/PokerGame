public class Card {
    private final String rank, suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank.getRank();
        this.suit = suit.getSuit();
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
