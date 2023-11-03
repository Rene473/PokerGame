import java.util.*;

public class PokerGame {

    Map<CardSuit, Map<CardRank, Card>> deck = new HashMap<>();


    public PokerGame() {

        for (CardSuit suit : CardSuit.values()) {
            deck.put(suit, new HashMap<>());
        }

        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                deck.get(suit).put(rank, new Card(rank, suit));
            }
        }

        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                System.out.println(deck.get(suit).get(rank));
            }
        }
    }
}
