package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void testGetSuit() {
        System.out.println("getSuit");
        String expectedSuit = "Hearts";
        String value = "5";
        BJCard instance = new BJCard(expectedSuit, value);
        String result = instance.getSuit();
        assertEquals(expectedSuit, result);
    }

    // Good test case
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        String suit = "Hearts";
        String expectedValue = "5";
        BJCard instance = new BJCard(suit, expectedValue);
        String result = instance.getValue();
        assertEquals(expectedValue, result);
    }

    // Good test case for non-face card
    @Test
    public void testGetPointsNonFaceCard() {
        System.out.println("getPointsNonFaceCard");
        String suit = "Hearts";
        String value = "5";
        int expectedPoints = 5;
        BJCard instance = new BJCard(suit, value);
        int result = instance.getPoints();
        assertEquals(expectedPoints, result);
    }

    // Boundary test case for Ace card
    @Test
    public void testGetPointsAceCard() {
        System.out.println("getPointsAceCard");
        String suit = "Hearts";
        String value = "A";
        int expectedPoints = 11;
        BJCard instance = new BJCard(suit, value);
        int result = instance.getPoints();
        assertEquals(expectedPoints, result);
    }

    // Boundary test case for face card
    @Test
    public void testGetPointsFaceCard() {
        System.out.println("getPointsFaceCard");
        String suit = "Hearts";
        String value = "Q";
        int expectedPoints = 10;
        BJCard instance = new BJCard(suit, value);
        int result = instance.getPoints();
        assertEquals(expectedPoints, result);
    }

    // Bad test case for invalid value
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidValue() {
        System.out.println("invalidValue");
        String suit = "Hearts";
        String invalidValue = "15";
        BJCard instance = new BJCard(suit, invalidValue);
    }

    // Bad test case for invalid suit
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSuit() {
        System.out.println("invalidSuit");
        String invalidSuit = "Stars";
        String value = "5";
        BJCard instance = new BJCard(invalidSuit, value);
    }

    // Good test case
    @Test
    public void testToString() {
        System.out.println("toString");
        String suit = "Hearts";
        String value = "5";
        BJCard instance = new BJCard(suit, value);
        String expResult = "5 of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}