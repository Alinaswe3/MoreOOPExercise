package com.aceindustries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightTest {

    public static ChessBoard board;
    public static Knight knight;
    public static Knight blackKnight;

    @BeforeEach
    public void setBlackKnight() {
        blackKnight = new Knight(Colors.BLACK);
    }

    @BeforeEach
    public void setKnight() {
        knight = new Knight(Colors.WHITE);
    }

    @BeforeEach
    public void setBoard() {
        board = new ChessBoard();
    }

    @Test
    public void knightCanMoveNorthEast() {
        board.addPiece(knight, "c1");
        board.printBoard();
        knight.moveNE(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("d3"));
    }

    @Test
    public void knightCanMoveNorthWest() {
        board.addPiece(knight, "c1");
        board.printBoard();
        knight.moveNW(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("b3"));
    }

    @Test
    public void knightCanMoveEastNorth() {
        board.addPiece(knight, "c1");
        board.printBoard();
        knight.moveEN(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("e2"));
    }

    @Test
    public void knightCanMoveEastSouth() {
        board.addPiece(knight, "c3");
        board.printBoard();
        knight.moveES(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("e2"));
    }

    @Test
    public void knightCanMoveWestNorth() {
        board.addPiece(knight, "c3");
        board.printBoard();
        knight.moveWN(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("a4"));
    }

    @Test
    public void knightCanMoveWestSouth() {
        board.addPiece(knight, "c3");
        board.printBoard();
        knight.moveWS(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("a2"));
    }

    @Test
    public void knightCanMoveSouthEast() {
        board.addPiece(knight, "c3");
        board.printBoard();
        knight.moveSE(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("d1"));
    }

    @Test
    public void knightCanMoveSouthWest() {
        board.addPiece(knight, "c3");
        board.printBoard();
        knight.moveSW(board);
        board.printBoard();
        assertEquals(knight,board.getSquare("b1"));
    }

    @Test
    public void blackKnightCanMoveSouthEast() {
        board.addPiece(blackKnight, "d5");
        board.printBoard();
        blackKnight.moveSE(board);
        board.printBoard();
        assertEquals(blackKnight, board.getSquare("c7"));
    }
}
