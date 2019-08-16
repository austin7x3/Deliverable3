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
public class restartGameTest {
    
    public restartGameTest() {
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
     * Test of restartGame method, of class restartGame.
     */
    @Test
    public void testRestartGameYes() throws Exception {
        System.out.println("yes");
        
        String inputData = "yes";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int expResult = 1;
        int result = restartGame.restartGame();
        assertEquals(expResult, result);
    }
    @Test
    public void testRestartGameNo() throws Exception {
        System.out.println("n");
        
        String inputData = "n";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int expResult = 0;
        int result = restartGame.restartGame();
        assertEquals(expResult, result);
    }
    @Test
    public void testRestartGameCaps() throws Exception {
        System.out.println("yEs");
        
        String inputData = "yEs";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int expResult = 1;
        int result = restartGame.restartGame();
        assertEquals(expResult, result);
    }
    @Test
    public void testRestartGameBlah() throws Exception {
        System.out.println("blahblah");
        
        String inputData = "blahblah";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        int expResult = 0;
        int result = restartGame.restartGame();
        assertEquals(expResult, result);
    }
    
    
}
