package com.arrays03.problems06;

public class ArmstrongNumber {
    static int digits(int num){
        int count = 0;
        while (num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    static boolean isArmStrong(int num){
        int temp = num;
        int sum = 0;
        int digitCount = digits(num);
        while (num!=0){
            int rem = num%10;
            sum += Math.pow(rem,digitCount);
            num /= 10;
        }
        return sum == temp;
    }
    public static void main(String[] args) {

        int num = 1634;
        if (isArmStrong(num)){
            System.out.println(num + " is an ArmStrong Number");
        }else System.out.println(num + " is not an ArmStrong Number");
    }
}
