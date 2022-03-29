package com.aceindustries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EightSubtracterTest {

    @Test
    public void returnZero() {
        assertEquals(0, com.aceindustries.EightSubtracter.subtractNumFromEight(8));
    }

    @Test
    public void returnThree() {
        assertEquals(3, com.aceindustries.EightSubtracter.subtractNumFromEight(5));
    }

    @Test
    public void returnFive() {
        assertEquals(5, com.aceindustries.EightSubtracter.subtractNumFromEight(3));
    }
}
