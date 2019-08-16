/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class surrenderTest {
    
    public surrenderTest() {
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

    /**
     * Test of surrender method, of class surrender.
     */
    @Test
    public void testSurrender1() {
        System.out.println("1");
        
        String inputData = "1";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int surrenderFlag = 0;
        Player playerOne = new Player("James");
        Player playerTwo = new Player("Frank");
        int expResult = 1;
        int result = surrender.surrender(surrenderFlag, playerOne, playerTwo);
        assertEquals(expResult, result);
    }
    @Test
    public void testSurrenderJames() {
        System.out.println("James");
        
        String inputData = "James";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int surrenderFlag = 0;
        Player playerOne = new Player("James");
        Player playerTwo = new Player("Frank");
        int expResult = 1;
        int result = surrender.surrender(surrenderFlag, playerOne, playerTwo);
        assertEquals(expResult, result);
    }
    @Test
    public void testSurrender2() {
        System.out.println("2");
        
        String inputData = "2";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int surrenderFlag = 0;
        Player playerOne = new Player("James");
        Player playerTwo = new Player("Frank");
        int expResult = 2;
        int result = surrender.surrender(surrenderFlag, playerOne, playerTwo);
        assertEquals(expResult, result);
    }
    @Test
    public void testSurrenderFrank() {
        System.out.println("Frank");
        
        String inputData = "Frank";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int surrenderFlag = 0;
        Player playerOne = new Player("James");
        Player playerTwo = new Player("Frank");
        int expResult = 2;
        int result = surrender.surrender(surrenderFlag, playerOne, playerTwo);
        assertEquals(expResult, result);
    }
    @Test
    public void testSurrenderBad() {
        System.out.println("blahblah then 1");
        
        String inputData = "blahblah\n8\n1";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int surrenderFlag = 0;
        Player playerOne = new Player("James");
        Player playerTwo = new Player("Frank");
        int expResult = 1;
        int result = surrender.surrender(surrenderFlag, playerOne, playerTwo);
        assertEquals(expResult, result);
    }
}
