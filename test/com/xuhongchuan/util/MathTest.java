package com.xuhongchuan.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by xuhongchuan on 2015/7/18.
 */
public class MathTest {

    @Test
    public void testFactorial() throws Exception {

        assertEquals(120, new Math().factorial(5));
        assertEquals(1, new Math().factorial(1));
        assertEquals(479001600, new Math().factorial(12));

    }

}
