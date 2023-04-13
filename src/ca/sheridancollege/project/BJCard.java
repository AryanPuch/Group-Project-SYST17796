package ca.sheridancollege.project;

/**
 * This the Blackjack Card class which inherits from the Card class.
 * 
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 1, 2023
 */
public class BJCard extends Card {
    
    private String suit;
    private String value;

    public BJCard(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getPoints() {
        switch (value) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                return Integer.parseInt(value);
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return 0;
        }
    }
    
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}