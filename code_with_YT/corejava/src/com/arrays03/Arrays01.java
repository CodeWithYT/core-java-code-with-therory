package com.arrays03;

// why we use arrays?
// representing the unstructured data to structured data for readability;
// and to continuous memory allocation;
//============================================================================================================================================
// what is array?
// an array is an object, and it is an indexed based collection of homogenous data elements into a single variable with fixed size;
//============================================================================================================================================
// ways to create array:
// type1:
// declaration - int[] arr;
// memory allocation - new int[5];
// initialization - int[0]=1; int[1]=1; int[2]=3;

// type:2
// declaration + initialization
// int[]arr = {1,2,3,4,5};
//============================================================================================================================================
// int arr = new int();❌ we cannot create object for primitive data type;
// int [] arr = new int[];✔️ we can create object for an array of primitive data type;
// the maximum size we can assign for an array is the max value of an integer;
//============================================================================================================================================
// array is an index based elements and the index starts from 0 to (n-1), and here n is the size of an array;
// example: int[]arr = [1, 2, 3, 4, 5];
//            indices - 0  1  2  3  4

// if call an array with its index it gives the value present in the that index;
// example arr[0] gives 1; arr[3] gives 4;

// array have length property which gives the size(n.o. elements present in the array) of the array;
// example: int[]arr = [1,3,5,9,4];
//            indices - 0 1 2 3 4; length = 5;
// if we print the reference variable of the array object it prints the address of the array;
//============================================================================================================================================
// error & exceptions in arrays:
// - array size expected (compile time error) - we need to initialize the size of the array while declaring an array;
// - array size too large (compile time error) - if the size of an array exceeds the max value of integer;

// - index out of bound exception (run time exception) - if we pass arguments more than the size-1 (index start from 0) of an array;
// - null pointer exception - if the array object is referred as null we cannot read the array;
//============================================================================================================================================

public class Arrays01 {
    public static void main(String[] args) {
        int[]arr=new int[5];
        arr = null;
//        arr[0]=1;
//        arr[1]=1;
//        arr[2]=1;
//        arr[3]=1;
//        arr[4]=1;
//        arr[5]=1;
        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i+1]);
        }
        System.out.println(arr);

    }
}
