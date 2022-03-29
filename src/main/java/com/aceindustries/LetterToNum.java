package com.aceindustries;

public class LetterToNum {

    public static int convertLetterToNum(char letter) {
        return letter - 97;
    }

    public static void main(String[] args) {
        System.out.println(convertLetterToNum('a'));
    }
}
