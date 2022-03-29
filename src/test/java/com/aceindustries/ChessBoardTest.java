package com.aceindustries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChessBoardTest {

    public static ChessBoard board;
    public static Knight knight;

    @BeforeEach
    public void setKnight() {
        knight = new Knight(Colors.WHITE);
    }

    @BeforeEach
    public void setBoard() {
        board = new ChessBoard();
    }

    @Test
    public void canGetPawn() {
        Piece piece = new Pawn(Colors.WHITE);
        board.addPiece(piece, "a8");
        assertEquals(piece, board.getPiece("a8"));
    }

    @Test
    public void canGetKnight() {
        Piece piece = new Knight(Colors.WHITE);
        board.addPiece(piece, "b1");
        assertEquals(piece, board.getPiece("b1"));
    }

    @Test
    public void canDeletePiece() {
        board.addPiece(new Pawn(Colors.WHITE), "a2");
        board.deletePiece("a2");
        assertNull(board.getSquare("a2"));
    }

    @Test
    public void canMoveC1KnightToD3() {
        board.addPiece(knight, "c1");
        assertEquals(knight, board.getSquare("c1"), "Piece has been placed at c1");
        knight.moveNE(board);
        assertNull(board.getSquare("c1"), "Piece is no longer at c1");
        assertEquals(knight, board.getSquare("d3"), "Piece is now at d3");
    }

    @Test
    public void canNotMoveC1KnightToInvalidSquare() {
        board.addPiece(knight, "a1");
        knight.moveSE(board);
        assertEquals(knight, board.getSquare("a1"));
    }

    @Test
    public void canNotMoveC1KnightToFriendlyOccupiedSquare() {
        board.addPiece(knight, "c1");
        Knight friendlyKnight = new Knight(Colors.WHITE);
        board.addPiece(friendlyKnight, "d3");
        board.printBoard();
        knight.moveNE(board);
        assertEquals(knight, board.getSquare("c1"));
    }

    @Test
    public void canMoveC1KnightToEnemyOccupiedSquare() {
        board.addPiece(knight, "c1");
        Knight enemyKnight = new Knight(Colors.BLACK);
        board.addPiece(enemyKnight, "d3");
        board.printBoard();
        knight.moveNE(board);
        assertEquals(knight, board.getSquare("d3"));
    }

    @Test
    public void printBoard() {
        board.addPiece(new Pawn(Colors.WHITE), "a8");
        board.addPiece(new Knight(Colors.WHITE), "b1");
        board.addPiece(new Pawn(Colors.WHITE), "b2");
        board.printBoard();
    }
}
