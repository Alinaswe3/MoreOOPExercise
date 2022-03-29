package com.aceindustries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChessNotationTest {

    @Test
    public void a8To00() {
        assertEquals("0,0", ChessNotation.convertCoordinates("a8"));
    }

    @Test
    public void h1To77() {
        assertEquals("7,7", ChessNotation.convertCoordinates("h1"));
    }

    @Test
    public void g5To63() {
        assertEquals("6,3", ChessNotation.convertCoordinates("g5"));
    }

    @Test
    public void d4To34() {
        assertEquals("3,4", ChessNotation.convertCoordinates("d4"));
    }
}
