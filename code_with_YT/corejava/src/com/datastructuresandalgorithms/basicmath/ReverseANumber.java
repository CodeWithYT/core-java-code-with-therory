package com.datastructuresandalgorithms.basicmath;

public class ReverseANumber {
    public static void main(String[] args) {
        int count = 0;
        int num = -2147483412;
        int reverse = reverse(num);
        System.out.println("original number: "+ num +"\nreversed number: "+ reverse);
    }

    public static int reverse(int x) {
        int reverse = 0;
        while(x != 0) {
                int rem = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
                reverse = (reverse * 10) + rem;
                x = x / 10;
            }
        return reverse;
    }
}
