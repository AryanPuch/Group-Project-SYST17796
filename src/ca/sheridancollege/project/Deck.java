package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class +++ Insert class description here +++
 * 
 * @author Aryan Puchimada
 */
public class Deck extends GroupOfCards {
    
    public Deck(int size) {
        super(new ArrayList<Card>(size));
    }
    
    public void addCard(BJCard card) {
        getCards().add(card);
    }
}