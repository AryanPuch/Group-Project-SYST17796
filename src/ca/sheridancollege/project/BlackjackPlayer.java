package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the Blackjack Player class which inherits from the Player class.
 * 
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 1, 2023
 */
public class BlackjackPlayer extends Player {
 private ArrayList<BJCard> hand;

    public BlackjackPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public void addCard(BJCard card) {
        hand.add(card);
    }

    public int getHandValue() {
        int handValue = 0;
        int acesCount = 0;
        for (BJCard card : hand) {
            handValue += card.getPoints();
            if (card.getValue().equals("A")) {
                acesCount++;
            }
        }

        while (handValue > 21 && acesCount > 0) {
            handValue -= 10;
            acesCount--;
        }

        return handValue;
    }

    public String showHand() {
        StringBuilder sb = new StringBuilder();
        for (BJCard card : hand) {
            sb.append(card).append(", ");
        }
        return sb.toString();
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        setName(scanner.nextLine());
    }
}