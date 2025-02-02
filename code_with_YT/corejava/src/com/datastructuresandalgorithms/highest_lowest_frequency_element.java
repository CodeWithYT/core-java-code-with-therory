package com.datastructuresandalgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class highest_lowest_frequency_element {
    public static void main(String[] args) {

        int [] arr = {2,2,3,4,4,2};
        frequency(arr);

    }

    static void frequency(int[]arr){
        int count = 1;
        int max = 0;
        int min = 1;
        int high = 0;
        int low = 0;
        boolean [] value = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (value[i] == true) {
                continue;
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    value[j] = true;
                    count++;
                }
            }
            if (max<count){
                max=count;
                high = arr[i];
            } else if (min>=count) {
                low = arr[i];
            }
            count=0;
//            System.out.println(arr[i]+" "+temp);
        }
        System.out.println(high);
        System.out.println(low);

    }

}
