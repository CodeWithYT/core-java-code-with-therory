package com.OopsConcepts06.Abstraction02;

public class AbsDriver extends Abstraction02{
    public static void main(String[] args) {

        AbsInf02 abs = new AbsDriver();
        System.out.println(abs.method1());
        abs.method2();
        abs.method5(2,5);
    }

    // abstract method in abstract class must be implemented in the subclass;
    @Override
    public void absMethod() {
        System.out.println("im abstract method in abstract class");
    }
}
