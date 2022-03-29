package com.aceindustries;

public class ChessNotation {

    public final static int FIRST_LETTER_INDEX = 0;
    public final static int SECOND_LETTER_INDEX = 1;

    /**
     * Method to convert chess coordinates to array coordinates
     * @param coordinates chess coordinates
     * @return array coordinates separated by a comma
     */
    public static String convertCoordinates(String coordinates) {
        if (coordinates.length() > 2) return "";
        String firstCoordinate = String.valueOf(LetterToNum.convertLetterToNum(coordinates.charAt(FIRST_LETTER_INDEX)));
        String secondCoordinate = String.valueOf(EightSubtracter.subtractNumFromEight(Integer.parseInt(coordinates.substring(SECOND_LETTER_INDEX))));
        return firstCoordinate + "," + secondCoordinate;
    }

    /**
     * Gets the first digit of the converted coordinates
     * @param numCoordinates string coordinates
     * @return int value
     */
    public static int getCoordinateTwo(String numCoordinates) {
        return Integer.parseInt(String.valueOf(numCoordinates.charAt(2)));
    }

    /**
     * Gets the second digit of the converted coordinates
     * @param numCoordinates string coordinates
     * @return int value
     */
    public static int getCoordinateOne(String numCoordinates) {
        return Integer.parseInt(String.valueOf(numCoordinates.charAt(0)));
    }


    public static void main(String[] args) {
        System.out.println(ChessNotation.convertCoordinates("a8"));
    }
}
