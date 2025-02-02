package com.datastructuresandalgorithms.basicmath;

public class CountDigits {
    public static void main(String[] args) {
        int num = 1234;
        int digits = evenlyDivides(num);
        System.out.println("number: "+num+ "\nno.of digits that can divide the number: "+ digits);
    }
    static int evenlyDivides(int n) {
        int num = n;
        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem != 0 && n%rem == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
    }
