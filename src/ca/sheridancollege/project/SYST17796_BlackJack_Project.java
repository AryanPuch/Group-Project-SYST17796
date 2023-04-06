package ca.sheridancollege.project;

import static ca.sheridancollege.project.Game.instructions;
import java.util.Scanner;

/**
 * This is the main class to run the Blackjack Game.
 * 
 * @author Aryan Puchimada Date: April 1, 2023
 */
public class SYST17796_BlackJack_Project {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name here:");
        String name = input.nextLine();
        instructions(name);
        
        BlackjackPlayer player = new BlackjackPlayer(name);
        BJCard cards = new BJCard();
        Deck groupOfCards = new Deck(52);
        BJCard.Value[] values = BJCard.Value.values();
        BJCard.Suit[] suits = BJCard.Suit.values();

        for (BJCard.Suit suit : suits) {
          for (BJCard.Value value : values) {
            BJCard card = new BJCard(value, suit);
            groupOfCards.addCard(card);
          }
        }
    }
}