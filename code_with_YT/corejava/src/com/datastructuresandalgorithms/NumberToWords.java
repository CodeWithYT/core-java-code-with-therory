package com.datastructuresandalgorithms;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        String input = sc.next();
        StringBuilder output = new StringBuilder();

        for (char digit : input.toCharArray()) {
            output.append(getWord(digit)).append(" ");
        }

        System.out.println(output.toString().trim());
    }

    private static String getWord(char digit) {
        switch (digit) {
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            case '0':
                return "zero";
            default:
                throw new IllegalArgumentException("Invalid input: " + digit);
        }
    }
}
