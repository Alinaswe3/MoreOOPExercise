package com.aceindustries;

import static com.aceindustries.ChessNotation.getCoordinateOne;
import static com.aceindustries.ChessNotation.getCoordinateTwo;

public class ChessBoard {

    // CONSTANTS
    public final static int SIZE = 8;

    private Piece[][] board = new Piece[SIZE][SIZE];

    /**
     * Method returns the board being used for the game
     * @return the board being used
     */
    public Piece[][] getBoard() {
        return this.board;
    }

    /**
     * Adds a piece to the board of the game
     * @param coordinates string coordinates of the piece
     * @param piece the piece being added to the board
     */
    public void addPiece(Piece piece, String coordinates) {
        piece.setCurrentSquare(coordinates);
        String numCoordinates = getNumCoordinates(coordinates);
        int coordOne = getCoordinateOne(numCoordinates);
        int coordTwo = getCoordinateTwo(numCoordinates);
        this.getBoard()[coordTwo][coordOne] = piece;
    }

    /**
     * Deletes a piece on the board
     * @param coordinates string coordinates of the piece
     */
    public void deletePiece(String coordinates) {
        String numCoordinates = getNumCoordinates(coordinates);
        this.getBoard()[getCoordinateTwo(numCoordinates)][getCoordinateOne(numCoordinates)] = null;
    }

    /**
     * Returns the piece at certain coordinates of the board
     * @param coordinates string coordinates
     * @return a piece
     */
    public Piece getPiece(String coordinates) {
        String converted = getNumCoordinates(coordinates);
        return getBoard()[getCoordinateTwo(converted)][getCoordinateOne(converted)];
    }

    /**
     * Prints out the board to the terminal
     */
    public void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                System.out.print(getBoard()[row][column] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Gets the coordinates converted to integer values
     * @param coordinates classic chess coordinates
     * @return integer value of coordinates but as string
     */
    private String getNumCoordinates(String coordinates) {
        return ChessNotation.convertCoordinates(coordinates);
    }

    /**
     * Returns what ever is on the specified square
     * @param coordinates the square to return the object
     * @return a piece or blank squre
     */
    public Object getSquare(String coordinates) {
        String numCoordinates = getNumCoordinates(coordinates);
        return getBoard()[getCoordinateTwo(numCoordinates)][getCoordinateOne(numCoordinates)];
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.addPiece(new Pawn(Colors.WHITE), "a2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "b2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "c2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "d2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "e2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "f2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "g2");
        chessBoard.addPiece(new Pawn(Colors.WHITE), "h2");
        chessBoard.printBoard();
        System.out.println(chessBoard.getSquare("a2"));
        chessBoard.printBoard();
    }
}
