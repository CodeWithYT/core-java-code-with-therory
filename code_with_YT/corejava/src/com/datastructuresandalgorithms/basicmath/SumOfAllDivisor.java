package com.datastructuresandalgorithms.basicmath;

public class SumOfAllDivisor {
    public static void main(String[] args) {
        int sum = sumOfDivisors(4);
        System.out.println(sum);
    }
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int r = i%j == 0 ? j :0;
                sum += r;
            }
        }
        return sum;
    }
}
