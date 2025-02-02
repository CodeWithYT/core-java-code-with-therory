package com.datastructuresandalgorithms;

import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int []arr = {10,5,10,15,10,5};
        frequency(arr);
    }
    static void frequency(int[]arr){
        int count = 1;
        boolean [] arr2 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i]){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr2[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
            count = 1;
        }
    }


}

