package com.aceindustries;

public class Knight extends Piece{

    public Knight(Colors colors) {
        super(colors);
    }

    public void moveNE(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 2;
        char boardColumn = (char) (getCurrentSquare().charAt(0) + 1);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveNW(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 2;
        char boardColumn = (char) (getCurrentSquare().charAt(0) - 1);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveEN(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 1;
        char boardColumn = (char) (getCurrentSquare().charAt(0) + 2);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveES(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 1;
        char boardColumn = (char) (getCurrentSquare().charAt(0) + 2);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveWN(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 1;
        char boardColumn = (char) (getCurrentSquare().charAt(0) - 2);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveWS(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 1;
        char boardColumn = (char) (getCurrentSquare().charAt(0) - 2);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveSE(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow;
        char boardColumn;
        if (this.getColor() == Colors.WHITE) {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 2;
            boardColumn = (char) (getCurrentSquare().charAt(0) + 1);
        }
        else {
            boardRow = Integer.parseInt(getCurrentSquare().substring(1)) + 2;
            boardColumn = (char) (getCurrentSquare().charAt(0) - 1);
        }

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    public void moveSW(ChessBoard chessBoard) {

        // Calculating the next move
        int boardRow = Integer.parseInt(getCurrentSquare().substring(1)) - 2;
        char boardColumn = (char) (getCurrentSquare().charAt(0) - 1);

        // Moving the piece to the next square
        String nextSquare = String.valueOf(boardColumn) + boardRow;
        if (isValidSquare(chessBoard, nextSquare)) movePiece(chessBoard, nextSquare);
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
