package com.OopsConcepts06.Abstraction02;

public interface AbsInf02 {
    int a = 33;

    String method1();

    void method2();

    void method3();

    void method4();

    void method5(int a, int b);

    static void method6(){
        System.out.println("im static method in interface");
    }

    default void def(){
        System.out.println("im default method in interface");
    }

    private void pvt(){
        System.out.println("im private method in interface");
    }

}
