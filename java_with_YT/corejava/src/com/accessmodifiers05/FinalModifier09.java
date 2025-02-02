package com.accessmodifiers05;

/*
 final modifier:
    - final is a modifier which is used for classes, inner classes, variables, methods;
                                                            *********** scope ****************
 class:
    - we can declare class as final if we declare class as final the class cannot be inherited/subclassed by others;
 inner class:
    - we can declare inner class as final if we declare class as final the class cannot be inherited/subclassed by others;
 methods:
    - we can declare methods as final if a method is declared as final it cannot be overridden by the child classes;
 variables:
    - we can declare variables as final if a variable is declared as final the value of the variable cannot be modified;
 block:
    - we cannot declare block as final.  The final keyword is not applicable to blocks;
 constructors:
    - we cannot declare constructor as final, You cannot declare constructors as final. Constructors are not inherited, so there is no need to prevent overriding;
 interface:
    - You cannot declare an interface as final. Interfaces are meant to be implemented by other classes, and making an interface final would contradict this purpose;
 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    final            yes;          yes;           yes;          yes;           no;           no;                no;
 */
public class FinalModifier09 {

    public static void main(String[] args) {


    }
}
