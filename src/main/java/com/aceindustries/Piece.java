package com.aceindustries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Piece {

    // Coordinate constants
    private static final byte COLUMN = 0;
    private static final byte ROW = 1;
    private static final byte MAX_COLUMN = 104;
    private static final byte MIN_COLUMN = 97;
    private static final byte MAX_ROW = 8;
    private static final byte MIN_ROW = 1;
    private static final byte MAX_MOVE_SIZE = 2;

    // Data field for a piece instance
    private Colors color;
    private String currentSquare;

    public Piece(Colors colors) {
        this.color = colors;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(String currentSquare) {
        this.currentSquare = currentSquare;
    }

    /**
     * Checks whether the next move to be played is valid
     * @param move - next move to be moved by a piece
     * @return a true if move is valid and false if move is invalid
     */
    protected boolean isValidMove(String move) {
        String regex = "[a-h][1-8]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(move);
        if (matcher.matches()) return true;
        else {
            System.out.println("Move " + move + " is invalid!");
            return false;
        }

    }


    /**
     * Checks the move and then moves the piece
     * @param chessBoard - the board on which the piece is placed
     * @param nextSquare - the calculated next move
     */
    protected void movePiece(ChessBoard chessBoard, String nextSquare) {

        // Deleting the piece
        chessBoard.deletePiece(getCurrentSquare());

        // Moving the piece
        if (isValidMove(nextSquare)) {
            chessBoard.addPiece(this, nextSquare);
        }
    }

    /**
     * Checks if a piece can capture an enemy piece
     * @param chessBoard - board on which the piece is placed
     * @param move - where the piece wants to go next
     * @return true if enemy piece is there or its null else its false
     */
    protected boolean isValidSquare(ChessBoard chessBoard, String move) {
        if (isValidMove(move)) {
            Piece square = (Piece) chessBoard.getSquare(move);
            return square == null || square.getColor() != this.getColor();
        }
        else return false;
    }
}
