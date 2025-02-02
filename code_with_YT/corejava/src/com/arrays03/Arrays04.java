package com.arrays03;

import java.util.Arrays;

/*                 2-D Array (or) multidimensional array;
 multidimensional array is an array of array in simple language each element in a multidimensional array is an array itself;
 representation of 2-D array:
 int [][] arr = new int [3][3]; -> declaration and memory allocation;
                         |  |
                       rows columns
 */
//=====================================================================================================================
public class Arrays04 {

    public static void main(String[] args) {

        int[][]arr = new int[3][3];
//        initialization;
        arr [0][0] = 2;
        arr [0][1] = 3;
        arr [0][2] = 8;
        arr [1][0] = 6;
        arr [1][1] = 9;
//        arr [1][2] = 7;
        arr [2][0] = 1;
//        arr [2][1] = 4;
        arr [2][2] = 5;
//      here we haven't assigned the index values of [1][2] and [2][1] so by default it takes the value as zero(0);

//            representing 2-D Array
//      we use 2 for-loops for representation of 2-D array outer loop is for rows and inner loop is for columns because outer loop runs index times and inner loop runs index element times;
        System.out.println("Representation of 2-d array with for-loop:");
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//=====================================================================================================================
//      2-D array declaration and initialization;
        int[][]arr2 = {{1,2,3},{4,5,6},{7,8,9}, {1,2,6}};
        System.out.println("Representation of 2-d array with for-each loop:");
//      to represent 2-D array with for each loop we convert the 2-D array to 1-D array, and again we take the for-each loop to convert 1-D array to store in a value;
        for (int [] i:arr2){
            for (int q: i){
                System.out.print(q+" ");
            }
            System.out.println();
        }
//======================================================================================================================
//        3-d array declaration and memory allocation;
        int[][][] arr3 = new int[3][3][3];
//        initialization
        arr3[0][0][0] = 1;
        arr3[0][0][1] = 2;
        arr3[0][0][2] = 3;

        arr3[0][1][0] = 4;
        arr3[0][1][1] = 5;
        arr3[0][1][2] = 6;

        arr3[0][2][0] = 7;
        arr3[0][2][1] = 8;
        arr3[0][2][2] = 9;

        arr3[1][0][0] = 3;
        arr3[1][0][1] = 2;
        arr3[1][0][2] = 1;

        arr3[1][1][0] = 6;
        arr3[1][1][1] = 5;
        arr3[1][1][2] = 4;

        arr3[1][2][0] = 9;
        arr3[1][2][1] = 8;
        arr3[1][2][2] = 7;

        arr3[2][0][0] = 1;
        arr3[2][0][1] = 2;
        arr3[2][0][2] = 3;

        arr3[2][1][0] = 4;
        arr3[2][1][1] = 5;
        arr3[2][1][2] = 6;

        arr3[2][2][0] = 7;
        arr3[2][2][1] = 8;
        arr3[2][2][2] = 9;
        System.out.println("declared, memory allocated, initialized 3-D Array representation with For-each loop: ");
        for (int[][]num2 : arr3){
            for (int[]num1 : num2){
                for (int num : num1){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
//=====================================================================================================================
//        3-d array declaration and initialization;
        int [][][] arr4 ={{{1,2,3},{4,5,6}},{{1,2,3},{4,5,6}},{{1,2,3},{4,5,6}}};
            System.out.println("declared and initialized 3-D Array representation with For-each loop: ");
            for (int[][]num2 : arr4){
                for (int[]num1 : num2){
                    for (int num : num1){
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                System.out.println();

            }

    }
}
