//calling of static and instance variables and methods
package com.introduction01;

public class Intro3 {
    static int officeId;
    static String officeName;

    int employeeId;
    String employeeName;

    static void greet(){
        System.out.println("Good Morning!!");
    }
    void welcome(){
        System.out.println("welcome to java intro3...");
    }
    static class New {
        static void print1(){
            System.out.println("I'm static method of nested class!!");
        }
        void print(){
            System.out.println("I'm an instance method of nested class!!");
        }
    }
    public static void main(String[] args) {
        // to call static variable and methods there is no need to create object, they can be called with the function or method name;
        //the static variables are initialized here;
        officeId = 22;
        officeName = "tech";
        greet();
        // to call instance variable or functions we need to create an instance of the class, object has its own properties, state and behaviour;
        Intro3 obj = new Intro3();
        // the instance variables are initialized here;
        obj.employeeId = 30;
        obj.employeeName = "tarun";
        // we can call the static method with the reference variable of the object, but it is not a good practice;
        obj.greet();
        // the instance method is called with reference variable of the object;
        obj.welcome();
        //calling of static method in nested class;
        New.print1();
        //calling of instance method in nested class;
        Intro3.New ob = new Intro3.New();
        ob.print();

    }
}
