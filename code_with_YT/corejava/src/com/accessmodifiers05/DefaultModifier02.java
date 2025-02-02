package com.accessmodifiers05;

/*default access modifiers:
    default is an access modifier which is not need to be implemented (if we not declare any access modifier for fields it takes default access modifier) and the scope of the default modifier is we can access the default modifier fields within the class and other classes within the same package;

                                                        *********** scope ****************
 class:
    - we can declare class as a default and the class is accessible with in the same class and classes with in the same package only;
 inner class:
    - we can declare inner class as default and the class is accessible with in the same class and classes with in the same package only;
 methods:
    - we can declare methods as default, and they can be accessible with in the same class and classes with in the same package only;
 variables:
    - we can declare variables as default, and they can be accessible with in the same class and classes with in the same package only;
 blocks:
    - we cannot declare block as a default as they are always executed in the context of class;
 constructor:
    - we can declare constructor as default, and we can create instance of the class with in the same class and classes with in the same package only;
 interfaces:
    - we can declare interfaces as default, and they can be accessible with in the same class and classes with in the same package only;
 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    default          yes;         yes;           yes;          yes;            no;           yes;               yes;
 */

class DefaultModifier02 {
    String name = "robert";
    class Dm{
        void method(){
            System.out.println("im am default method");
        }
    }
    DefaultModifier02(){
          System.out.println("im no arg constructor");
    }
    interface greet{
        void hello();
    }

    public static void main(String[] args) {

    }
}
