package com.arrays03.problems06;

import java.util.Arrays;

public class PrimeNumbers {
    static void prime(int[]arr){
        System.out.print("prime numbers in array: ");
        for (int i=0; i < arr.length;i++){
            for (int j=2; j<=arr[i]/2;j++) {
                if (arr[i]==0 || arr[i]==1){
                    continue;
                }
                if ((arr[i]%j) == 0){
                    System.out.print(arr[i]+", ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 0;
        int [] arr = new int[10];
            while (n<10){
                arr[n]=n+1;
                n++;
            }
        System.out.println(Arrays.toString(arr));
        prime(arr);
    }
}
