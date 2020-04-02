/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendual;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jose
 */
public class pruebaTest {

    public pruebaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of aProbar method, of class prueba.
     */
    @org.junit.jupiter.api.Test
    public void testAProbar() {
        System.out.println("aProbar");
        int q = 0;
        int expResult = 0;

        int result = prueba.aProbar(q);
        assertEquals(expResult, result);

        q = -1;
        expResult = 0;

        result = prueba.aProbar(q);
        assertEquals(expResult, result);

        q = 5;
        expResult = 25;

        result = prueba.aProbar(q);
        assertEquals(expResult, result);

    }

}
