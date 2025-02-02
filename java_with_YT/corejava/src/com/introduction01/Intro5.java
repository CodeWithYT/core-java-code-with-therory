package com.introduction01;

public class Intro5 {
    // as we talked previously that the JVM first search for main method and before execution of main method it executes the static blocks if any inside the class, but before execution of static block JVM search for the static variables inside the class and execute them first and after that it executes the static block
    // ** but here is one condition as we know the JVM interprets the code line by line if the static variable is after the static block line then the static block is executed first and then the static variable;
    //so here is the JVM execution flow :-
    // -> static variables;
    // -> static blocks;
    // -> instance variable;
    // -> main method;
    static Intro5 obj = new Intro5();
    {
        System.out.println("im instance block!!");
    }
    static {
        System.out.println("im static block!!");
        // question :- why the below method call is executing infinite times?
//        obj.greet();
    }
    void greet(){
        System.out.println("Good Morning!!");
        obj.greet();
    }

    public static void main(String[] args) {
        Intro5 obj = new Intro5();
    }
}
