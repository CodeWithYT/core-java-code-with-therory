package com.accessmodifiers05;

/* protected access modifier:
        protected is an access modifier the data members which are declared as protected can be accessible with in the same class and classes with in the same packages and also by the subclass of the outer class of outer package;

                                                            *********** scope ****************
 class:
    - we cannot declare class as a protected because the class is not accessible to the classes outside of the package so we cannot create the instance of the class outside of the package to call the various data members;
 inner class:
    - we can declare inner class as protected and the class is accessible with in the same class and classes with in the same package and subclasses outside of the package;
 methods:
    - we can declare methods as protected and they are accessible with in the same class and classes with in the same package and subclasses outside of the package;
 variables:
    - we can declare variables as protected and they are accessible with in the same class and classes with in the same package and subclasses outside of the package;
 blocks:
    - we cannot declare block as a protected as they are always executed in the context of class;
 constructor:
    - we can declare constructor as protected and we are able to create instance of the class with in the same class and classes with in the same package and subclasses outside of the package;
 interfaces:
    - we cannot declare interfaces as protected because interfaces needed to be implemented so if we declare interface as protected we cannot implement them in outer classes ;
*/
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    protected        no;         yes;            yes;          yes;            no;           yes;               no;
 */

public class ProtectedModifier03 {
    public static void main(String[] args) {

    }
}
