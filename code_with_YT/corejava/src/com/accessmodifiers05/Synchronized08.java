package com.accessmodifiers05;
/*
 synchronized
    - synchronized is a modifier used to control access to a method or a block of code by multiple threads, ensuring that only one thread can execute the synchronized code at a time. This helps prevent race conditions and ensures thread safety;
                                                            *********** scope ****************
 class:
    -  we cannot declare a class as synchronized. Synchronization is a concept that applies to methods and blocks of code, not to entire classes;
 inner class:
    - Similar to top-level classes, you cannot declare an inner class as synchronized;
 methods:
    - yes we can declare methods as synchronized so that only one thread can execute it at a time for a given instance;
 variables:
    -  You cannot declare variables as synchronized. Synchronization is about controlling access to code, not data;
 block:
    - While you can synchronize blocks of code, you cannot declare a block itself as synchronized outside a method;
 constructor:
    - You cannot declare constructors as synchronized. However, you can synchronize the code inside a constructor using a synchronized block;
interfaces:
    - You cannot declare an interface as synchronized. Synchronization is a runtime behavior, and interfaces are meant to define method signatures, not behavior;
 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    synchronized     no;          no;            yes;           no;            no;           no;                no;
 */
public class Synchronized08 {
    public static void main(String[] args) {

    }
}
