package com.introduction01;

public class Intro4 {
    // in java the JVM first search for the main method before executing the main method it searches for the static blocks if any;

    // as the static data is loaded in the method area along with the class data i.e, when the class is loaded the static data is also loaded so while execution the JVM first search for the main method after that it's going search for the static blocks if any, if any static blocks present in the class those will execute first;

    //after the execution of the static blocks, it enters into the main method in that if there are any function calls present they will be executed after that if the object of class is created the JVM searches for the instance block if any, if there are any instance blocks present in the class then they will be executed(remember as the JVM interprets line by line the instance block will be executed when JVM hits the line where the object is created);

    //after completion of executing of static and instance blocks (depending on the line where object is created) JVM enters into the main method and at last the methods in the main method are executed;

    //if we create an instance of a class inside a class the line will not even execute, if the object of the class created inside the class and also in the main method it throws STACK OVERFLOW ERROR!!!;
    //Intro4 n = new Intro4(); -> if we uncomment this line jvm throws stack overflow error;

    {
        System.out.println("I'm instance block!!");     // 3rd execution;
    }
    static {
        System.out.println("I'm static block!!");       // 1st execution;
    }
    static void demo(){
        System.out.println("I'm static method!!");
    }
    void demo2(){
        System.out.println("I'm instance method");
    }

    public static void main(String[] args) {
        demo();                                         // 2nd execution;
        Intro4 obj = new Intro4();
        obj.demo2();                                    // 4rd execution;
    }
}

// we can have N number of static and instance blocks
