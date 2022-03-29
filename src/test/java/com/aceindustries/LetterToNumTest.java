package com.aceindustries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterToNumTest {

    @Test
    public void aTo1() {
        assertEquals(1, com.aceindustries.LetterToNum.convertLetterToNum('a'));
    }

    @Test
    public void zTo26() {
        assertEquals(26, com.aceindustries.LetterToNum.convertLetterToNum('z'));
    }

    @Test
    public void jTo10() {
        assertEquals(10, com.aceindustries.LetterToNum.convertLetterToNum('j'));
    }
}
