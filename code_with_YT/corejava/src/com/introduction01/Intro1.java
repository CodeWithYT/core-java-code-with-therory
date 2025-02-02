package com.introduction01;

public class Intro1 {
    //we can store - data members(static and instance variables and static and instance methods),constructor, blocks, inner classes(nested classes), interfaces;

    //these are the static fields or variables here the variables are declared but not assigned;
    static int officeId;
    static String officeName;

    //these are the instance variables or fields here also the variables are declared but not assigned;
    int employeeId;
    String employeeName;

    // these are the static functions/methods;
    static void greet(){
        System.out.println("Good Morning!!");
    }
    static int sum(){
        int a = 20;
        int b = 60;
        return a+b;
    }
    //these are the instance functions/methods;
    void welcome(){
        System.out.println("welcome to java intro...");
    }
    int divide(){
        int a = 4;
        int b = 2;
        return a/b;
    }
    // this is the constructor, the constructor is a method/function, and it is the name of the class itself;
    Intro1(){
        System.out.println("i'm the constructor!!");
    }
    //blocks, blocks are of two types static block and instance block;
    //this is the static block
    static {
        officeId = 2;
        officeName = "VCube";
        System.out.println("i'm a static block!!");
    }
    //this is the instance block;
    {
        employeeId = 96;
        System.out.println("i'm an instance block!!");
    }
    //this the inner class or nested class;
    static class InnerClass{
        InnerClass(){
            System.out.println("i'm a constructor of inner class!!");
        }
    }
    interface human{
        void talk();
        default void walk(){
            System.out.println("walking");
        }
    }
    public static void main(String[] args) {



    }
}
