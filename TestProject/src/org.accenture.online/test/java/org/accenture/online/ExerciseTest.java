package org.accenture.online;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExerciseTest{
    @Test
    public void test(){
        assertEquals(new Exercise().hello(), "hi");
    }
    @Test
    public void test2(){
        //assertNotEquals(new Exercise().hello(), "hi2");
       Boolean a = false;
       Boolean b = null;
        //assertTrue(a || b);
    }
}
