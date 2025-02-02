package com.languagefundamentals02;

public class methods07 {
    //instance methods;
    void greet(){
        //we can call instance method in an instance method without creating object;
        hello();
        System.out.println("good morning!!");   // 4th executed
    }
    void hello(){
        //we can call static methods in an instance method;
        talk();
        System.out.println("how are you?");     // 3rd executed
    }
    static void talk(){
        System.out.println("i'm talking!!");    // 1st executed
        //we cannot call instance method in static methods without creating object;
//        greet();
        //we can call static method in static method;
        ready();
    }
    static void ready(){
        System.out.println("i'm ready...");     // 2nd executed
    }
    public static void main(String[] args) {
//        methods: method is a block of code which can be used repeatedly to organize our code  with the help of methods we can achieve Don't Repeat Yourself (DRY) principle;
        methods07 obj = new methods07();
            obj.greet();
            
    }
}
