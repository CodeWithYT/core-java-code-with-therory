package com.datastructuresandalgorithms.basicmath;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("given number: "+num+"\nis Prime: "+isPrime(num));
    }
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        boolean status = false;
        int c = 2;
        while (c <= n/2){
            status = n % c != 0;
            c++;
        }return status;
    }
}
