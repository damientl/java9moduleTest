package org.accenture.online.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest{
    @Test
    public void test(TestInfo info){
        assertEquals(new Exercise().hello(), "hi");
    }
    @Test
    public void test2(TestInfo info){
        //assertNotEquals(new Exercise().hello(), "hi2");
       Boolean a = false;
       Boolean b = null;
        //assertTrue(a || b);
    }
}
