package com.accessmodifiers05;
/*
 native modifier:
    - In Java, the native keyword is used to indicate that a method is implemented in native code using the Java Native Interface (JNI). This means the method is written in a language other than Java, such as C or C++;
                                                            *********** scope ****************
 class:
    - Classes and inner classes are structures that define the blueprint of objects and do not have an implementation that can be directly mapped to native code;
 inner class:
    - Classes and inner classes are structures that define the blueprint of objects and do not have an implementation that can be directly mapped to native code.
 methods:
    - The native keyword is specifically designed for methods because it allows Java to call functions written in other languages. This is useful for performance optimization or accessing platform-specific features;
 variables:
    - Variables represent data storage and do not have executable code. The native keyword is meant for methods that have executable code written in another language, so it doesn't apply to variables;
 block:
    - Code blocks are sequences of statements executed in a specific context. They are not methods and thus cannot be declared as native;
 constructor:
    - Constructors are special methods used to initialize objects. They are tightly integrated with the Java object model and memory management, making it impractical to implement them in native code;
 interface:
    - Interfaces define a contract for what methods a class should implement. They do not contain method implementations themselves, so the native keyword, which indicates a method’s implementation is in native code, is not applicable;
 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    native           no;          no;             yes;          no;           no;           no;                no;
 */


public class NativeModifier12 {
    public static void main(String[] args) {

    }
}
