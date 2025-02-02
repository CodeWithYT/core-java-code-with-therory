package com.OopsConcepts06.Abstraction02;

public interface AnimalInterface01 {

    int b = 100;    //  by default all variables in interfaces are public static final;
    void walk();

    void eat();

    void sleep();

    default void color(){
        System.out.println("enter specified color while accessing because i can be overridden");
    }
    static void breath(){
        System.out.println("im breath method i cannot be overridden");
    }
}
