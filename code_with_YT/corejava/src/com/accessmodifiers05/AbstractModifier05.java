package com.accessmodifiers05;

/*
 Abstract modifier:
    - abstract is a modifier which can be implemented to classes and methods when we want to achieve abstraction means the classes which are declared as abstract cannot be instantiated directly it is meant to be subclassed and the class which inherits abstract class must implement all the abstract methods;
    - in an abstract class if there is no need to declare the methods as abstract but if in a class there is any abstract methods then the class itself needs to be declared as abstract;
                                                            *********** scope ****************
 class:
    -we can declare class as abstract and the abstract class cannot be instantiated and may contain abstract methods that must be implemented by subclasses;
 inner class:
    -we can declare inner class as abstract and the abstract class cannot be instantiated and may contain abstract methods that must be implemented by subclasses;
 methods:
    - we can declare methods as abstract abstract methods do not contain body and if the methods declared as abstract the class in which these abstract methods present needs to be declared as abstract and if the abstract class is inherited the subclass needs to implement the abstract methods;
 variables:
    - no we cannot declare variables as abstract as they store values so they cannot have incomplete implementation;
 block:
    - no we cannot declare blocks as abstract as the blocks are for execution and must have concrete implementation;
 constructors:
    - no we cannot declare constructors as abstract as they are used to initialize the objects and must have concrete implementation;
 interfaces:
    - no we cannot declare interfaces as abstract as the methods present in the interface are implicitly abstract unless they are default or static methods;

 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    abstract         yes;         yes;           yes;           no;            no;           no;               no;
 */
abstract class test {
    void writing() {
        System.out.println("im writing");
    }
}
abstract class exam extends test{

}
public class AbstractModifier05 {
    public static void main(String[] args) {

    }
}
