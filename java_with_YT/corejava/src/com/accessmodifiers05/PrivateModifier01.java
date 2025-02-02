package com.accessmodifiers05;

/* private access modifier:
private is an access modifier which is implemented if we want our data members to be accessible with in the class only and the data members which are declared as private cannot be accessible in the other class of same package or by the outer classes of the different packages;

                                              *********** scope ****************
 for classes:
    - we cannot declare class as a private, because if a class is declared as private it would be inaccessible by the outer classes which are in the same package this will make the class essentially useless because we cannot create object of the class and call its methods;
 for inner classes:
    - as the inner classes are for temporary requirement, we can declare the inner classes as private, and we can call the private inner class by creating instance of the outer class and then creating the instance of the inner class with the help of the reference variable of the outer class;
 for methods:
    - we can declare methods as private to restrict the access of the methods from the outside classes of the same package or from the outer packages and can be accessed with in the same class itself;
 for variables:
    - we can declare our variables as private to restrict the access of our variables by other classes outside of the same package or by the outer packages and can be only accessible with in the same class;
 for blocks:
    - we can not declare our blocks as private as they take the modifier which is assigned to its class;
 for constructors:
    - we can declare constructor as private, but if we declare constructor as private we cannot create the object of the class from outside of the class of same package also from the other packages however we can create instance of the class within the class itself by using a static method or design pattern like singleton;
    - singleton pattern: the singleton pattern ensures that only one instance of the class is created and provides a global point of access to it;
 for interfaces:
    - we cannot declare top level interfaces as private because it would be completely inaccessible to any other class, but we can declare interfaces of nested classes as private this means inner class is only accessible by the outer class;
 */
//  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
//  private          no;           yes;           yes;         yes;           no;            yes;               no;

public class PrivateModifier01 {
    private interface name{
        void name();
    }
    private int a =10;

    private PrivateModifier01(){

    }
    private class Inner {

    }

    public static void main(String[] args) {

        PrivateModifier01 pm = new PrivateModifier01();
        Inner i = pm.new Inner();
    }
}
