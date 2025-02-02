package com.datastructuresandalgorithms;

public class RepeatCharacters {
    public static void main(String[] args) {
        String input = "a2b5c3";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char character = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                output.append(character);
            }
        }

        System.out.println(output.toString());
    }
}
 class DoubleDigitCharacters {
    public static void main(String[] args) {
        String input = "a2b12c4";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); ) {
            char character = input.charAt(i++);
            StringBuilder countString = new StringBuilder();

            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                countString.append(input.charAt(i++));
            }

            int count = Integer.parseInt(countString.toString());

            for (int j = 0; j < count; j++) {
                output.append(character);
            }
        }

        System.out.println(output.toString());
    }
}


