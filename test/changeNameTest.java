/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FF
 */
public class changeNameTest {

    public changeNameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        Player playerOne = null;
        Player playerTwo = null;
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

    /**
     * Test of changeName method, of class changeName.
     */
    @Test
    public void testPlayer1ChangeName() {
        System.out.println("Change Player One to Bob");

        String inputData = "1\nBob";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        Player playerOne = new Player("Player One");
        Player playerTwo = new Player("Player Two");

        changeName.changeName(playerOne, playerTwo);
        assertEquals("Bob",playerOne.getPlayerID());
    }
    @Test
    public void testPlayer2ChangeName() {
        System.out.println("Change Player Two to Franklin");

        String inputData = "2\nFranklin";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        Player playerOne = new Player("Player One");
        Player playerTwo = new Player("Player Two");

        changeName.changeName(playerOne, playerTwo);
        assertEquals("Franklin",playerTwo.getPlayerID());
    }
    @Test
    public void testPlayer2BadChangeName() {
        System.out.println("Change Player Two to Franklin with bad inputs");

        String inputData = "blah\nno\n2\nFranklin";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        Player playerOne = new Player("Player One");
        Player playerTwo = new Player("Player Two");

        changeName.changeName(playerOne, playerTwo);
        assertEquals("Franklin",playerTwo.getPlayerID());
    }
}
