public enum CardSuit {
    Diamonds("Diamonds"),
    Spades("Spades"),
    Hearts("Hearts"),
    Clubs("Clubs");

    private final String suit;

    CardSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
