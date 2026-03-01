package org.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {

    private Util util;

    @BeforeEach
    public void setUp()
    { util = new Util(); }


    @Test
    public void testOddsArr() {
        assertArrayEquals(new int[]{1,3,5,7},util.checkingOdds(7));

    }

    @Test
    public void testKeyword(){
        assertTrue(util.checkingVariable("break"));
    }


}
