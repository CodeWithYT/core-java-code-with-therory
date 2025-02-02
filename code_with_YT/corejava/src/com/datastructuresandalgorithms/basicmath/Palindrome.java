package com.datastructuresandalgorithms.basicmath;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1551;
        boolean check = isPalindrome(num);
        System.out.println("given number: "+num+"\nis palindrome: "+check);
    }
    public static boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        while(num > 0){
            int rem = num%10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        if (reverse == x){
            return true;
        }
        return false;
    }
}
