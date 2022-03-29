package com.aceindustries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    public static ChessBoard board;
    public static Pawn pawn;
    public static Pawn blackPawn;

    @BeforeEach
    public void setBlackPawn() {
        blackPawn = new Pawn(Colors.BLACK);
    }

    @BeforeEach
    public void setPawn() {
        pawn = new Pawn(Colors.WHITE);
    }

    @BeforeEach
    public void setBoard() {
        board = new ChessBoard();
    }

    @Test
    public void canPawnMoveOneSquareForward() {
        board.addPiece(pawn, "a2");
        board.printBoard();
        pawn.moveOneForward(board);
        board.printBoard();
        assertEquals(pawn,board.getSquare("a3"));
    }

    @Test
    public void canPawnMoveTwoSquaresForwardOnFirstMove() {
        board.addPiece(pawn, "a4");
        board.printBoard();
        pawn.moveTwoForward(board);
        board.printBoard();
        assertEquals(pawn, board.getSquare("a6"));
    }

    @Test
    public void canNotMoveTwoAfterFirstMove() {
        board.addPiece(pawn,"a2");
        board.printBoard();
        pawn.moveOneForward(board);
        board.printBoard();
        pawn.moveTwoForward(board);
        board.printBoard();
        assertEquals(pawn, board.getSquare("a3"));
    }

    @Test
    public void canMoveOneDiagonallyRight() {
        board.addPiece(pawn, "c4");
        board.printBoard();
        pawn.captureRight(board);
        board.printBoard();
        assertEquals(pawn, board.getSquare("d5"));
    }

    @Test
    public void canMoveOneDiagonallyLeft() {
        board.addPiece(pawn, "c4");
        board.printBoard();
        pawn.captureLeft(board);
        board.printBoard();
        assertEquals(pawn, board.getSquare("b5"));
    }

    @Test
    public void blackPawnCanMoveForward() {
        board.addPiece(blackPawn, "d7");
        board.printBoard();
        blackPawn.moveOneForward(board);
        board.printBoard();
        assertEquals(blackPawn,board.getSquare("d6"));
    }

    @Test
    public void blackPawnCanMoveTwoForwardOnFirstMove() {
        board.addPiece(blackPawn, "d7");
        board.printBoard();
        blackPawn.moveTwoForward(board);
        board.printBoard();
        assertEquals(blackPawn, board.getSquare("d5"));
    }

    @Test
    public void canBlackPawnMoveOneDiagonallyRight() {
        board.addPiece(blackPawn, "d7");
        board.printBoard();
        blackPawn.captureRight(board);
        board.printBoard();
        assertEquals(blackPawn, board.getSquare("c6"));
    }

    @Test
    public void canBlackPawnMoveOneDiagonallyLeft() {
        board.addPiece(blackPawn, "e7");
        board.printBoard();
        blackPawn.captureLeft(board);
        board.printBoard();
        assertEquals(blackPawn, board.getSquare("f6"));
    }
}
