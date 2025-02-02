package com.OopsConcepts06.Inheritance03;
/*
    what is inheritance?
    inheritance is like a family tree for classes. It is a fundamental concept that allows us to create a hierarchy of related classes, where one class can inherit properties and behaviours from another class;

    why we need inheritance?
    for code reusability and to reduce the object creations that is we have access modifiers through which we can also achieve code reusability but to use the functionality of other classes we need to create objects of the classes so if we have 100 classes we need to create 100 objects, so to minimize the object creation we need inheritance by this with one object of the child class we can access the data of n number of parent classes with this we can achieve flexibility and code reusability;

    how to achieve inheritance?
        - extends --> Is-A Relationship;
        - new     --> Has-A Relationship;

    Is-A Relationship:
        - if we have a relation between two classes we say Is-A relationship;
                                vehicle;
                            car - Is-A vehicle;
                            bike - Is-A vehicle;
                            bus - Is-A vehicle;

    Has-A Relationship:
        - if we do not have a relation between two classes we say Has-A relationship;
                                 engine;
                            car - Has-A engine;
                            bike - Has-A vehicle;
                            bus - Has-A vehicle;

    whether we extend a class or not implicitly every class extends object class;

    types of inheritance:
        - single inheritance:
            a class extending one class is known as single inheritance;
            class A;
            class B;
            class A extends B;

        - multiple inheritance:
            child class extending two parent classes is known as the multiple inheritance, but multiple inheritance is not possible in java because if there are same named methods present in both extended classes then it will be unable to understand that which data needed be executed so ambiguity occurs and this also known as the diamond problem;
            class A;
            class B;
            class C extends A,B; --> not possible❌;

        - multi-level inheritance:
            a parent class has the direct child class and the child class becomes the parent for another class is known as multi-level inheritance;
            class A;
            class B extends A;
            class C extends B;

        - hierarchical inheritance:
            a single super class serves as the parent for multiple subclasses is known as hierarchical inheritance;
            class A;
            class B extends A;
            class C extends A;

        - hybrid inheritance:
            two or more type of inheritance within a single class is known as hybrid inheritance that is a class can extends super class and implements interfaces;
            class A;
            interface B;
            interface C;
            class D extends A implements B,C;

        - cyclic inheritance:
            Cyclic inheritance occurs when a class tries to inherit from itself directly or indirectly through a chain of classes;
                class A extends B;
                class B extends A;
                     or
                class C extends C;
            cyclic inheritance is not possible in java ❌;

*/

class loan {
    void incomeEligibility(){
        System.out.println("income must be greater than 2l");
    }
    void age(){
        System.out.println("age must be greater than 21");
    }
}

class homeLoan extends loan{
    void interestRate(){
        System.out.println("home loan interest rate: 8%");
    }
}

public class inheritance01 {

    public static void main(String[] args) {

//      by creating object of the child class we can access all the data members fo the parent class and the child class;
        homeLoan h = new homeLoan();
        h.age();
        h.interestRate();

//      by creating object of the child class and reference of the parent class we can only access the data members of the parent class;
        loan l = new homeLoan();
//        the above process we can say it as up-casting, up-casting means we can say it as abstraction;
//        direct down-casting is not possible, but it is possible by explicit type casting;
        
    }

}
