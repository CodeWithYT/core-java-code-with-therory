package com.accessmodifiers05;
/*
public access modifier:
    - public is an access modifier the fields which are declared as public can be accessed in the same class and by the other classes of same package and by the outer c;
                                                *********** scope ****************
 class:
    - we can declare class as public and the public can be accessed in the same class and classes of same package and outer classes of different package;
 inner class:
    - we can declare inner class as public and the class is accessible with in the same class and classes with in the same package and also by the classes of outer packages;
 methods:
    - we can declare methods as public, and they can be accessible with in the same class and classes with in the same package and also by the classes of outer packages;
 variables:
    - we can declare variables as public, and they can be accessible with in the same class and classes with in the same package and also by the classes of outer packages;
 blocks:
    - we cannot declare block as a block as they are always executed in the context of class;
 constructor:
    - we can declare constructor as public, and we can create instance of the class from any where outside of the class and package;
 interfaces:
    - we can declare interfaces as public, and they can be accessible from any where outside of the class and package note if we declare the top level interface as public then the class name of the interface must be same as the name of the interface;

 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
     public          yes;         yes;            yes;          yes;           no;           yes;               yes;
 */

public class PublicModifier04 {
    public int a = 50;
    public class Demo{

        public void man(){
            System.out.println("im man");
        }

    }
    public PublicModifier04(){

    }
    public interface mobile{
        void ringing();
    }

    public static void main(String[] args) {

    }
}
