package ca.sheridancollege.project;

/**
 * This the Blackjack Card class which inherits from the Card class.
 * 
 * @author Aryan Puchimada Date: April 1, 2023
 */
public class BJCard extends Card {
    
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private Value value;
    private Suit suit;
    
    public BJCard() {}
    
    public BJCard(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    @Override
    public String toString() {
        return "";
    }
}