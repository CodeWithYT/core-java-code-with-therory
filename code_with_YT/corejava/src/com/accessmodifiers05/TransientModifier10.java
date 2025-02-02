package com.accessmodifiers05;
/*
 transient modifier:
    - The transient modifier in Java is used to indicate that a field should not be serialized when an object is converted into a byte stream. Serialization is the process of converting an object’s state into a format that can be stored or transmitted and later reconstructed. When a field is marked as transient, it is excluded from this process.
                                                            *********** scope ****************
 class:
    - The transient keyword is meant to exclude certain fields from serialization. Applying it to a class would not make sense because classes themselves are not serialized; their instances are;
 inner class:
    - Similar to top-level classes, you cannot declare an inner class as transient;
 Methods:
    - Methods define behavior and do not hold state. The transient keyword is used to control the serialization of state (instance variables), not behavior;
 variables:
    - yes we can declare variables as transient for instance variables to prevent them from being serialized;
 blocks:
    -   Blocks are used to execute code during class loading or object creation. They do not hold state that would be serialized, so marking them as transient is not applicable;
 constructors:
    -  Constructors are used to initialize objects. They are not part of the object’s state that gets serialized, so marking them as transient is irrelevant;
 interfaces:
    - Interfaces define a contract for classes to implement. They do not hold state or instance-specific data that would be serialized, so the concept of a transient interface does not apply;
 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    transient        no;          no;             no;          yes;           no;           no;                no;
 */
public class TransientModifier10 {
    public static void main(String[] args) {

    }
}
