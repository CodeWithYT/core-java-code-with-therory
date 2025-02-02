package com.OopsConcepts06.Abstraction02;
/*
    why we need abstract for classes?
    - when ever we do not want to create an object directly for a class then we need to go for abstract classes, and we will achieve abstraction;
    - if we implement interfaces for a class we must need to implement all the abstract methods present in the interface class but for our some classes only need some specifications only but if we implements interface we need to implement all the methods in it, so there will be unnecessary memory allocation so to overcome this drawback we use abstract classes where the abstract class implements the interface class if we implement the methods present in the abstract class or not there will be no error then we create concrete methods inside the abstract class, and we extend the abstract for our required class using extends keyword then we can implement our only required specific methods to the subclass;
    - there is no multiple inheritance in java that we can only extend one parent class to subclass so we cannot extend multiple abstract classes but we can implement multiple interfaces;
    - the subclass which inherits abstract class must implement all the abstract methods if any declared inside the abstract class;


    what is abstract?
    - abstract is a keyword we can use for methods and classes;
    - if we use for methods then we do not have an implementation;
    - if we are assign for classes we cannot create an object for classes;
    - in abstract classes we can have both abstract methods, normal methods and concrete methods, variables and constructors;
    - if a class is abstract then the class no need to have any abstract methods but in a class if we have abstract methods then the class need to be declared as abstract;
    - we cannot create objects for abstract class;

    Abstract Class Constructors:
        - Abstract classes can have constructors. These constructors are used for initialization, just like in regular classes.
        - If you don’t explicitly define a constructor in an abstract class, the Java Virtual Machine (JVM) provides a default constructor for you.

    Why No Direct Object Creation?
        - The purpose of an abstract class is to provide a blueprint for other classes (subclasses) to inherit from.
        - Abstract classes often contain abstract methods (methods without a body) that must be implemented by their subclasses.
        - Since an abstract class may have incomplete or undefined behavior (due to abstract methods), it does not make sense to create direct objects of it.

    Creating Reference Variables:
        - You can create a reference variable of an abstract class. This reference variable can point to objects of its derived classes (subclasses).
        - The actual object creation happens in the derived classes, not in the abstract class itself.

 */

public abstract class Abstraction02 implements AbsInf02 {

    int a = 50;     // abstract class can have variables, like in interfaces variables in abstract class are not public static final;

    public Abstraction02(){         // abstract class can have constructor;
        System.out.println("im a constructor in abstract");
    }

    // concrete methods;
    @Override
    public String method1() {
        return "im method 1 of return type string";
    }

    @Override
    public void method2() {
        System.out.println("im method 2 of return type void");
    }

    @Override
    public void method3() {
        System.out.println("im method 3 of return type void");
    }

    @Override
    public void method4() {
        System.out.println("im method 4 of return type void");
    }

    @Override
    public void method5(int a, int b) {
        System.out.println("im method 5 of sum: "+ (a+b));
    }

    public void nrlMethod(){        // normal method;
        System.out.println("im normal method in abstract");
    }

    public abstract void absMethod();   // abstract method, and these abstract methods must be implemented when we extend the abstract class;

}
