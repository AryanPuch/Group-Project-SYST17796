/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author Aryan Puchimada Date: April 1, 2023
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();
    
    public ArrayList<Player> register() {
        return players;
    }
    
    public void startGame() {
        
    }
    
    public void startNewGame() {
        
    }
    
    public int selectBet() {
        return 0;
    }
    
    public void exitGane() {
        
    }
    
    public int checkTotalScore() {
        return 0;
    }
    
    public boolean isWin() {
        return true;
    }
    
    public void displayRules() {
        
    }
    
    public void nextMoveChoices() {
        
    }
    
    public void split() {
        
    }
    
    public void displayBet(int betValue) {
        
    }
    
    public void displayScore(int score) {
        
    }
    
    public static void instructions(String name) {
        
        System.out.println("Welcome to Blackjack Game, " + name + "!");
        System.out.println("The instructions for this game are:");
        System.out.println("1.Instruction\n2.Instruction");
    }
}//end class