package com.arrays03;

import java.util.Scanner;

/* Representation of Arrays:
    to represent an array we use "for-loop";
        syntax of for loop:
            for(int i=0; i<100; i++){
            }
            here,
            int i=0 - initializing the value to say from where it needs to start;
            i<0     - condition to say till where it needs to execute;
            i++/i-- - incrementing or decrementing the value after every execution;
*/
public class Arrays02 {

    public static void main(String[] args) {

        int[]arr = {11,22,33,55,66};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" "); // 11 22 33 55 66;
        }

        int[]arr2 = new int[4];
        arr2[0] = 12;
        arr2[1] = 22;
        arr2[2] = 13;
        arr2[3] = 42;
        arr2[4] = 42;   // index exceed
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]); // won't even execute till index 3 and throws Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 at com.arrays03.Arrays02.main
            // because the jvm interprets line by line and while memory allocation itself the range will be exceeded;

        }

    }
}
