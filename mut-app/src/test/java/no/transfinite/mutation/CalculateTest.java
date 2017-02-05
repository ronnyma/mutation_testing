package no.transfinite.mutation;

import junit.framework.TestCase;

/**
 * Created by ronnyma on 05/02/2017.
 */
public class CalculateTest extends TestCase {
    public void setUp() throws Exception {
        cl = new Calculate();

    }

    public void testAdd() throws Exception {
        assertEquals(14, cl.add(5,9));
    }

    public void testSubtract() throws Exception {
        assertEquals(6,cl.subtract(18,12));

    }

    public void testMin() throws Exception {
        assertTrue(true);
    }

    Calculate cl;
}