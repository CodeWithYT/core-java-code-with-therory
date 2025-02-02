package com.OopsConcepts06.Abstraction02;
/*
    abstraction:
        - hiding the implementation and only showing the necessary data is known as abstraction;
        - for security we need abstraction;
    we can achieve abstraction through - interface and abstract;

    interface:
        - An interface in Java is like a blueprint of a class. It defines a set of methods (with empty bodies) that other classes must implement. we can Think of it as a contract: “Hey, if you want to be part of my club, you have to follow these rules!
        - interfaces are of three types:
            - normal interface;
                - if we have many number of abstract methods and static methods inside an interface it is known as normal interface;

            - functional interface;
                - in interface we have only single abstract method then we can say that interfaces called functional interface, and we can have many number of default methods as well as static methods and private methods;
                - in java we want to achieve lambda expression we must need to go for functional interface;

            - marker interface;
                - A marker interface (also known as a tagging interface) is an interface that does not contain any methods or fields. Its primary purpose is to serve as a marker or tag for classes that implement it. These interfaces indicate that the implementing classes have some special behavior or characteristics;
==========================================================================================================================================================
    normal interfaces:
        - interface is a keyword to create interfaces;
        - interface is a blueprint of a class;
        - interface is a service requirement specification (SRS) but not implementation;
        - interface and inherit other interface using extends keyword;
        - interface classes can be implemented by other classes using implements keyword;
        - the class which implements interfaces must provide the implementation;
        - with abstraction multiple inheritance is not allowed, but we can implement multiple interfaces;

-----------------------------up to 1.7 version-----------------------------------------
    - in interface we have only abstract methods which doesn't have any implementation but only declaration;
    - whether we declare our methods in interface with abstract or not by default all methods are public and abstract;
    - in interface by default we have all variables as public static final - public static final int a = 100;;

-----------------------------up to 1.8 version-----------------------------------------
    - from 1.8 version in interface we have default and static methods which we have implementation;

        default methods in interface:
            - up to java 1.7 java is 100% abstraction but from version 1.8 for the first time they introduced default methods with implementation in interfaces to "achieve backward compatibility". We can write any number of default methods inside interfaces, and we can over-ride;
        example:
        for better understanding imagining we have some classes which implementing interface after some time we want to add some more specifications to our program, so we declared some more abstract methods inside our interface as we know if a class implementing interface it must and should implement all the abstract methods inside the interface, so we need to implement all the added new abstract methods into all the classes implementing the interface for few classes we can do manually, but let us imagine we have 100's of classes, and we want to implement our new added methods only to few classes to overcome that scenario we use default methods;

        static methods in interface:
            - if we want to provide constant behaviour for our implemented classes which is shared or common by every class we use static methods, and we cannot override static methods;

    - and from java 1.8 we can keep public static void main(String[]args) in interface classes to run;

-----------------------------up to 1.9 version-----------------------------------------
    - from 1.9 version in interface we have private method also which have implementation;

        private methods in interface:
           - Private methods help reduce code duplication within an interface;
           - If multiple default methods need to share common code, a private interface method allows them to do so without exposing that method to implementing classes;
           - we can access private method in default methods but not in static methods;


    example:
        - predefined class methods in java like (Arraylist methods, String methods extra);
        - a client approaches an organization for a project requirement he has some set of specifications for the operations to be done so for that specifications we create a template for a class by creating and interface class, and we implement that specification and provide implementation;
        - ATM it has some specifications like check balance, withdraw extra;

==========================================================================================================================================================

 */

public class Monkey01 implements AnimalInterface01 {
    public static void main(String[] args) {
        Monkey01 m = new Monkey01();    // if we create object of the implemented class it won't hide the implementation while we debug the code;
        m.eat(); m.sleep();         // if we ctrl + click on the method it will debug into the implementation file and shows the implementation;
        System.out.println(b);

//      for security to hide the implementation part to be displayed we create the object of the implemented class with reference of the interface class;
        AnimalInterface01 a = new Monkey01();
        a.eat(); a.sleep();        // if we ctrl + click on the method it will debug into the declaration file but not into the implementation file by this the hiding of implementation and showing the necessary details principle is achieved;

    }

    @Override
    public void walk() {
        System.out.println("monkey can walk and jump");
    }

    @Override
    public void eat() {
        System.out.println("monkey eat banana");
    }

    @Override
    public void sleep() {
        System.out.println("monkey sleep at night");
    }

    @Override
    public void color() {
        AnimalInterface01.super.color();
    }
//    AnimalInterface01.breath();

}
