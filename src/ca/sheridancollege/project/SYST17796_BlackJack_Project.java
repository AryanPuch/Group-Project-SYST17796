package ca.sheridancollege.project;

import java.util.Scanner;


/**
 * This is the main class to run the Blackjack Game.
 * 
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 1, 2023
 */
public class SYST17796_BlackJack_Project extends Game {
    
    private Deck deck;
    private BlackjackPlayer player;

    public SYST17796_BlackJack_Project() {
        super("Blackjack");
        deck = new Deck();
    }

    public void dealInitialCards() {
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
    }

    public boolean playerTurn() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean endTurn = false;
        while (!endTurn) {
            System.out.println("Your hand: " + player.showHand() + "Total points: " + player.getHandValue());
            System.out.println("Do you want to (H)it or (S)tand?");
            choice = scanner.nextLine().toUpperCase();

            if (choice.equals("H")) {
                player.addCard(deck.dealCard());
                if (player.getHandValue() > 21) {
                    System.out.println("Busted! Your hand: " + player.showHand() + "Total points: " + player.getHandValue());
                    endTurn = true;
                    return false;
                }
            } else if (choice.equals("S")) {
                endTurn = true;
            } else {
                System.out.println("Invalid input. Please enter 'H' or 'S'.");
            }
        }
        return true;
    }

    @Override
    public void play() {
        player = new BlackjackPlayer("Player");
        player.play();
        dealInitialCards();
        boolean playerWon = playerTurn();

        if (playerWon) {
            System.out.println("Congratulations " + player.getName() + "! You won with a hand of " + player.showHand() + "Total points: " + player.getHandValue());
        } else {
            System.out.println("You lost. Better luck next time, " + player.getName() + "!");
        }
    }

    @Override
    public void declareWinner() {
        // This method is not used in this implementation.
    }
    
    public static void main(String[]args) {
        
        SYST17796_BlackJack_Project blackjackGame = new SYST17796_BlackJack_Project();
        blackjackGame.play();
    }
}