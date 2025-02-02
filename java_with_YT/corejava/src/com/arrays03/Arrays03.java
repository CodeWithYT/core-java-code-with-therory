package com.arrays03;

import java.util.Scanner;

                                // conditionals:
// if(condition){
// return or statement;
// }
// else if(){
// else if used to make nested if conditions for simple understanding, the condition in the if is true the statement in the if condition will be executed if not then the condition in the else-if will be checked if its true then the statements in the else if will be executed;
// }
// else{
// if the conditions in the else and else if are false then only the statement in the else will be executed;
// }
// else condition is optional we can use if condition alone;

//=======================================================================================================================
                                //Scanner class;
//there is a class in java.util called "scanner" which is used to take input for the user;
// Scanner sc = new Scanner(System.in);
// here System.in is a  method which will take input form the keyboard;
//========================================================================================================================
public class Arrays03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = s.nextInt();
        String [] arr = new String[size];
        System.out.println("enter the" + size + "values you want to store: ");
        for (int i=0; i< arr.length;i++){
            arr[i]=s.next();    // if we enter "s." we can access the methods present in the scanner class to read the type of data we want to store
                                // here we used s.next it's a method to take input of string until the spaces were created to read data with spaces we use sc.nextLine;
        }
        // we used "for-each" loop to print the array it is the optimized form of for-loop, but we need to access the index values we use for-loop;
        for (String names : arr){
            System.out.println(names);
        }
    }
}
