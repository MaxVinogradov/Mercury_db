package p1.test;

import org.junit.Test;
import p1.test.Test1;

import static org.junit.Assert.assertEquals;

public class TestM1 {

    @Test
    public void testPlus() {
        Test1 test1 = new Test1();
        assertEquals(test1.plus(4, 5), 9);
        assertEquals(test1.plus(4, 4), 4);
    }


}
