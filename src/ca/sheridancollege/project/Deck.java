package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This the Blackjack Deck class which inherits from the GroupOfCards class.
 * 
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 1, 2023
 */
public class Deck extends GroupOfCards {
    
    private static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Deck() {
        super(52);
        this.cards = new ArrayList<>();
        for (String suit : SUITS) {
            for (String value : VALUES) {
                cards.add(new BJCard(suit, value));
            }
        }
        shuffle();
    }

    public BJCard dealCard() {
        return (BJCard) cards.remove(0);
    }
}