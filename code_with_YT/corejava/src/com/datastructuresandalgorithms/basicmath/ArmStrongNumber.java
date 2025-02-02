package com.datastructuresandalgorithms.basicmath;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 9474;
        boolean check = isArmStrong(num);
        System.out.print("given number: "+ num +"\nis ArmStrong: " + check);
    }
    public static int numberCount (int n){
        int count = 0;
        while (n != 0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static boolean isArmStrong (int n){
        int num = n;
        int sum = 0;
        while (num != 0){
            int rem = num%10;
                sum += Math.pow(rem,numberCount(n));
                num /= 10;
        }
        return sum == n;
    }
}
