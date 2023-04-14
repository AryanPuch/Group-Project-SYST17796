package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This the Blackjack BJCardTest class.
 * 
 * @author Aryan, Shivam, Sofiya, Noman, & Jay  Date: April 13, 2023
 */
public class BJCardTest {
    
    public BJCardTest() {
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
    public void testGetSuitGood() {
        System.out.println("getSuitGood");
        String expectedSuit = "Hearts";
        String value = "5";
        BJCard instance = new BJCard(expectedSuit, value);
        String result = instance.getSuit();
        assertEquals(expectedSuit, result);
    }

    // Good test case
    @Test
    public void testGetValueGood() {
        System.out.println("getValueGood");
        String suit = "Hearts";
        String expectedValue = "5";
        BJCard instance = new BJCard(suit, expectedValue);
        String result = instance.getValue();
        assertEquals(expectedValue, result);
    }

    // Good test case for non-face card
    @Test
    public void testGetPointsNonFaceCardGood() {
        System.out.println("getPointsNonFaceCardGood");
        String suit = "Hearts";
        String value = "5";
        int expectedPoints = 5;
        BJCard instance = new BJCard(suit, value);
        int result = instance.getPoints();
        assertEquals(expectedPoints, result);
    }

    // Boundary test case for Ace card
    @Test
    public void testGetPointsAceCardBoundary() {
        System.out.println("getPointsAceCardBoundary");
        String suit = "Hearts";
        String value = "A";
        int expectedPoints = 11;
        BJCard instance = new BJCard(suit, value);
        int result = instance.getPoints();
        assertEquals(expectedPoints, result);
    }

    // Boundary test case for face card
    @Test
    public void testGetPointsFaceCardBoundary() {
        System.out.println("getPointsFaceCardBoundary");
        String suit = "Hearts";
        String value = "Q";
        int expectedPoints = 10;
        BJCard instance = new BJCard(suit, value);
        int result = instance.getPoints();
        assertEquals(expectedPoints, result);
    }

    // Bad test case for invalid value
    @Test
    public void testInvalidValue() {
        System.out.println("Bad: invalidValue");
        String suit = "Hearts";
        String invalidValue = "15";
        BJCard instance = new BJCard(suit, invalidValue);
    }

    // Bad test case for invalid suit
    @Test
    public void testInvalidSuit() {
        System.out.println("Bad: invalidSuit");
        String invalidSuit = "Stars";
        String value = "5";
        BJCard instance = new BJCard(invalidSuit, value);
    }

    // Good test case
    @Test
    public void testToStringGood() {
        System.out.println("toStringGood");
        String suit = "Hearts";
        String value = "5";
        BJCard instance = new BJCard(suit, value);
        String expResult = "5 of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}