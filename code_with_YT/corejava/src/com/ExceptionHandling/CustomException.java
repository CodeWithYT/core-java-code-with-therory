package com.ExceptionHandling;

import java.util.Scanner;

class Custom  extends Throwable{
    Custom(String s){
        super(s);
    }


}
public class CustomException {
    public static void main(String[] args) throws Custom {

        Scanner sc = new Scanner(System.in);
//        throw new RuntimeException("tarun");
        System.out.print("enter your age: ");
        int a = sc.nextInt();
        if (a <= 0){
            throw new Custom("must be greater than zero");
//            throw new RuntimeException("age must be greater than 0");
        }
    }
    public static void sum (int a,int b) throws Exception {
        if (a<0){
            throw new Exception("try with 5");
        }
        else {
        int c = a+b;
        System.out.println(c);
        }
    }
}
