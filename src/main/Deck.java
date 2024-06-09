package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        Suit[] suits = {Suit.HEARTS, Suit.DIAMONDS, Suit.SPADES, Suit.CLUBS};
//        todo: make rank enum
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (Suit suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (!cards.isEmpty()) {    // if cards list (deck) has at least 1 card in it...
            return cards.remove(0);
        }
        return null;
    }
    public Card[] draw(int numOfCards) {
        int i;
        Card[] cardsDrawn = new Card[numOfCards];
        for (i = 0; i < numOfCards; i++){
            if (!cards.isEmpty()) {    // if cards list (deck) has at least 1 card in it...
                cardsDrawn[i] = cards.remove(i);
            }
        }
        return cardsDrawn;
    }

}