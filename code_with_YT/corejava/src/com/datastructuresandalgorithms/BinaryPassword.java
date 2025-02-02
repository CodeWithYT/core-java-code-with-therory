package com.datastructuresandalgorithms;
/*
Q: solve a problem, where you need to find the minimum number of changes required to make a binary password string secure. The password must be divided into non-overlapping, even-length substrings that contain only 1s or 0s but not a mix
.*/
public class BinaryPassword {
    public static int minFlips(String password) {
        int n = password.length();
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Password length must be even.");
        }

        int flips = 0;

        for (int i = 0; i < n; i += 2) {
            char first = password.charAt(i);
            char second = password.charAt(i + 1);

            if (first != second) {
                flips++;
            }
        }

        return flips;
    }

    public static void main(String[] args) {
        String password = "011010";  // Example binary string
        int result = minFlips(password);
        System.out.println("Minimum flips required: " + result);
    }
}
