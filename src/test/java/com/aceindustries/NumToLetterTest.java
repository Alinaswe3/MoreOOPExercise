package com.aceindustries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumToLetterTest {

    @Test
    public void OneToA() {
        assertEquals('a', com.aceindustries.NumToLetter.convertNumToLetter(1));
    }

    @Test
    public void TwentySixToZ() {
        assertEquals('z', com.aceindustries.NumToLetter.convertNumToLetter(26));
    }

    @Test
    public void TenToJ() {
        assertEquals('j', com.aceindustries.NumToLetter.convertNumToLetter(10));
    }
}
