package com.aceindustries;

public class Pawn extends Piece{

    boolean hasMovedOnFirstMoveBefore;

    public Pawn(Colors color) {
        super(color);
    }

    /**
     * Method moves the pawn forward on the board
     * @param chessBoard - the board on which the piece is placed
     */
    public void moveOneForward(ChessBoard chessBoard) {

        // Calculating the next square
        int boardRow;
        if (this.getColor() == Colors.WHITE) {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 1;
        }
        else {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 1;
        }

        // The next square variable
        String nextSquare = getCurrentSquare().substring(0, 1) + boardRow;

        // Moving the pawn
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);

        // Checking if the pawn has already moved before not
        if (!hasMovedOnFirstMoveBefore) hasMovedOnFirstMoveBefore = true;
    }

    /**
     * Method moves the pawn two squares forward on the board
     * @param chessBoard - the board on which the piece is placed
     */
    public void moveTwoForward(ChessBoard chessBoard) {
        if (!hasMovedOnFirstMoveBefore) {
            this.moveOneForward(chessBoard);
            this.moveOneForward(chessBoard);
        }
    }

    /**
     * Method captures an enemy piece to the Right of the pawn
     * @param chessBoard - the board on which the piece is placed
     */
    public void captureRight(ChessBoard chessBoard) {

        // Calculating the next square
        int boardRow;
        char boardColumn;
        if (this.getColor() == Colors.BLACK) {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 1;
            boardColumn = (char) (getCurrentSquare().charAt(0) - 1);
        }
        else {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 1;
            boardColumn = (char) (getCurrentSquare().charAt(0) + 1);
        }

        String nextSquare = String.valueOf(boardColumn) + boardRow;

        // Moving the pawn
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);

    }

    /**
     * Method captures an enemy piece to the Right of the pawn
     * @param chessBoard - the board on which the piece is placed
     */
    public void captureLeft(ChessBoard chessBoard) {

        // Calculating the next square
        int boardRow;
        char boardColumn;
        if (this.getColor() == Colors.BLACK) {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 1;
            boardColumn = (char) (getCurrentSquare().charAt(0) + 1);
        }
        else {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 1;
            boardColumn = (char) (getCurrentSquare().charAt(0) - 1);
        }

        String nextSquare = String.valueOf(boardColumn) + boardRow;

        // Moving the pawn
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);

    }

    @Override
    public String toString() {
        return "Pawn";
    }


}