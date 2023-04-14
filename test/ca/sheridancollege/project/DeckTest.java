package ca.sheridancollege.project;

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 13, 2023
 */
public class DeckTest {
    
    public DeckTest() {
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
    public void testDealCardGood() {
        System.out.println("dealCardGood");
        Deck instance = new Deck();
        BJCard result = instance.dealCard();
        assertNotNull(result); // Checking if the result is not null
    }

    // Bad test case
    @Test(expected = NoSuchElementException.class)
    public void testDealCardBad() {
        System.out.println("dealCardBad");
        Deck instance = new Deck();
        for (int i = 0; i < 52; i++) {
            instance.dealCard(); // Dealing all 52 cards
        }
        instance.dealCard(); // Attempting to deal a card from an empty deck
    }

    // Boundary test case
    @Test
    public void testDealCardBoundary() {
        System.out.println("dealCardBoundary");
        Deck instance = new Deck();
        for (int i = 0; i < 51; i++) {
            instance.dealCard(); // Dealing 51 cards
        }
        BJCard result = instance.dealCard(); // Dealing the last card in the deck
        assertNotNull(result); // Checking if the result is not null
    }
}