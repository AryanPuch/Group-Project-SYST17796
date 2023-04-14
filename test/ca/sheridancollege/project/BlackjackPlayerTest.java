package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This the Blackjack BlackjackPlayerTest class.
 * 
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 13, 2023
 */
public class BlackjackPlayerTest {
    
    public BlackjackPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // Good test case
    @Test
    public void testAddCardGood() {
        System.out.println("addCardGood");
        BJCard card = new BJCard("Hearts", "5");
        BlackjackPlayer instance = new BlackjackPlayer("John");
        instance.addCard(card);
        assertEquals(instance.showHand().contains("5 of Hearts"), true);
    }

    // Bad test case
    @Test
    public void testAddCardBad() {
        System.out.println("addCardBad");
        BJCard card = null;
        BlackjackPlayer instance = new BlackjackPlayer("John");
        instance.addCard(card);
    }

    // Boundary test case (minimum value)
    @Test
    public void testGetHandValueMinBoundary() {
        System.out.println("getHandValueMinBoundary");
        BlackjackPlayer instance = new BlackjackPlayer("John");
        instance.addCard(new BJCard("Hearts", "2"));
        int expResult = 2;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
    }

    // Boundary test case (maximum value)
    @Test
    public void testGetHandValueMaxBoundary() {
        System.out.println("getHandValueMaxBoundary");
        BlackjackPlayer instance = new BlackjackPlayer("John");
        instance.addCard(new BJCard("Hearts", "A"));
        instance.addCard(new BJCard("Spades", "K"));
        int expResult = 21; // Assuming Ace value is 11 and King value is 10
        int result = instance.getHandValue();
        assertEquals(expResult, result);
    }
}