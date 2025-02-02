package com.languagefundamentals02;

public class methods08 {
//    here it is the method of sum which takes two arguments and add them, while calling this method need to pass the parameters in the method;
    static void sum(int a, int b){
        System.out.println(a+b);
    }
//    method which takes char as arguments
    static void symbol(char a, char b){
//      as we know if we perform arithmetic operations on char they are implicitly converted to int;
        System.out.println(a+b);
    }
    static void myAge (String a, int b){
//      the "+" is used to concatenate two strings, concatenation is the process of combining two or more strings into a single string;
        System.out.println(a+": "+b);
    }
    static void myAge (String a, int b, int c){
//        as we know "+" operators works as concatenation i.e., joining of two or strings, so if any data types are performing "+" with a String rather than performing operations it performs concatenation, so we need to 'BOD MAS' principle;
        System.out.println(a + b + c+"❌"); // value: 22; ❌
        System.out.println(a + (b + c)+"✔\uFE0F"); // value: 4; ✔️
    }

    public static void main(String[] args) {
        sum(20, 10);
        symbol('a', 'b');
        myAge("tarun", 22);
        myAge("value",2,2);


    }
}
