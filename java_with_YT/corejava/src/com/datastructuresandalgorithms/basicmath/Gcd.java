package com.datastructuresandalgorithms.basicmath;

import java.util.Arrays;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(Gcd(11, 13));
    }
    static int Gcd(int a, int b) {
        while(a>0 && b>0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            if (a == 0){
                return b;
            }
        }
        return a;
    }
}
