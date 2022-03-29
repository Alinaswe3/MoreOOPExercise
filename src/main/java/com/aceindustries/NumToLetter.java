package com.aceindustries;

public class NumToLetter {

    public static char convertNumToLetter(int num) {
        return (char) ((char) num + 96);
    }

    public static void main(String[] args) {
        System.out.println(convertNumToLetter(1));
    }
}
