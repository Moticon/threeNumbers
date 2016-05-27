package com.moticon.threenumbers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by moticon on 5/26/2016.
 */
public class TestThreeNumbers {

    public TestThreeNumbers(){
    }

    @Test
    public void testSum(){
        ThreeNumbers threeNumbers = new ThreeNumbers(10, 20, 30);
        assertEquals("Error - Sum incorrect", Integer.valueOf(10+20+30), threeNumbers.getSum());
    }

    @Test
    public void testProduct(){
        ThreeNumbers threeNumbers = new ThreeNumbers(3, 5, 9);
        assertEquals("Error - Product incorrect", Integer.valueOf(3*5*9), threeNumbers.getProduct());
    }
    @Test
    public void testGetters(){
        ThreeNumbers threeNumbers = new ThreeNumbers(3, 5, 9);
        assertEquals("Getter for A failed", Integer.valueOf(3), threeNumbers.getA() );
        assertEquals("Getter for B failed", Integer.valueOf(5), threeNumbers.getB() );
        assertEquals("Getter for C failed", Integer.valueOf(9), threeNumbers.getC() );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowException(){
        ThreeNumbers threeNumbers = new ThreeNumbers(-1,0,1);
        threeNumbers.throwException();
    }
}
