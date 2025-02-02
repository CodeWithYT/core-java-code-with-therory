package com.accessmodifiers05;
/*
volatile modifier:
    - The volatile modifier in Java is used to indicate that a variable’s value may be changed by different threads, Changes made to a volatile variable by one thread are immediately visible to other threads. This ensures that all threads see the most recent value of the variable;
                                                            *********** scope ****************
 class:
    - The volatile keyword is meant to control the visibility of variable changes across threads. Applying it to a class would not make sense because classes themselves are not subject to concurrent modifications;
 inner class:
    - Same Reason as Top-Level Classes: Inner classes are also not subject to concurrent modifications, so the concept of volatile does not apply;
 methods:
    - Behavior vs. State: Methods define behavior, not state. The volatile keyword is used to control the state of variables, ensuring visibility of changes. Methods do not have a state that needs to be controlled in this way;
 variables:
    - Static Variables: The volatile keyword is applicable only to instance variables, not static variables. Static variables are shared across all instances and are not subject to the same visibility issues;
 block:
    -  Blocks are used to execute code during class loading or object creation. They do not hold state that would be subject to visibility issues across threads;
 constructor:
    - Constructors are used to initialize objects and do not have a state that needs to be controlled for visibility across threads. The volatile keyword is irrelevant in this context;
 interface:
    - Interfaces define a contract for classes to implement and do not hold state. The volatile keyword is used to control the state of variables, which is not applicable to interfaces;
 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    Volatile        no;          no;             no;          yes;           no;           no;                no;
 */

public class VolatileModifier11 {
    public static void main(String[] args) {

    }
}
