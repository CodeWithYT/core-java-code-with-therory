package com.languagefundamentals02;

public class Keywords03 {

    public static void main(String[] args) {
        /*
        -> keywords or reserved words are words which are reserved for java we cannot use them as an identifier;
        -> the keywords const and goto are reserved even though they are not currently used;
        -> true, false and null might seem to be keywords, but they are literals which cannot be used as an identifier;
        */
        /*
        we have 50 keywords in java they are:
        data types (8):
        1. byte: value ranges from -128 to 127, it takes 1 byte, default value 0;
        2. short: value ranges from (-2)^16/2 to ((2)^16/2)-1, takes 2 bytes, default value 0;
        3. int: value ranges from (-2)^32/2 to ((2)^32/2)-1, takes 4 bytes, default value 0;
        4. long: value ranges from (-2)^64/2 to ((2)^64/2)-1, takes 8 bytes, default value 0;
        5. float: value ranges from (not sure), takes 4 bytes, default value 0;
        6. double: value ranges from (not sure), takes 8 bytes, default value 0;
        7. char: value ranges from 0 to 65535(2^16-1), it takes 2 bytes ->because it supports unicode, default value \u0000;
        8. boolean: value can be true or false, size depends on JVM, default value is false;
        */
        /*
        application keywords (14):
        1. package: package is a collection of related classes and interfaces;
        2. import: it is used to import classes, interfaces or entire packages into the source file without entering its package name in reference;

        3. class: class is a name group of functions and properties, class is a blueprint or template of an object;
        4. interface: interface is a blueprint of set of methods, any class which implements interface must implement the methods of the interface it defines a contract ensuring the implementing classes provide specific behaviour without specifying how it is achieved, with interface we can achieve abstraction and enabling multiple inheritance;
        5. enum: it is used to store the constant values like sunday, monday,tuesday extra;

        6. new: it is used to create object of the class;
        7. instanceof: it is used to check whether an object is an of specific type(class, subclass, interface) it returns only true or false;

        8. void: if a method does not return any value the void keyword is used;
        9. return: if a method returns some value the return keyword is used inside at end of the method block;
       10. this: it is used to represent an instance of the class in which it appears;
       11. super: it is used to refer the immediate parent class within the subclass;

       12. extends: it is used to achieve inheritance, used to acquire the properties of one interface to other and one class to other;
       13. implements: used to implement abstract methods declared by the interface;
       14. assert: it is used for debugging and testing purpose. It allows you to check the correctness of the assumptions made in our program;
         */
        /*
        access modifiers (12):
        1. private: private keyword is used if we want our methods, fields, or inner class to be accessible by different members within the same class;
        2. <default>: we can access the default members within the own class and from the other classes within the same package;
        3. protected: we can access the protected members within the own class and within the same package and also within the subclasses of the different packages;
        4. public: if we want to access our class, fields, or methods from anywhere outside the class we use public keyword;

        5. abstract: abstract keyword is used to when we want our class to hide the implementation,a method with no definition must be declared as abstract, if a method inside a class is abstract then the class must be declared as abstract, abstract classes cannot be initiated, this keyword is used for classes, methods ;
        6. static: this keyword is used when our data is shared by many objects it can be implemented for variables and methods, blocks, subclasses;
        7. strictfp: this keyword is used to restrict the precision and rounding of floating point calculation, by this keyword java became completely platform independent language, but after java17 the strictfp is strictly evaluated. It can be implemented for classes and methods;
        8. synchronized: this keyword used to control the access shared between the resource by multiple threads it can be implemented for methods, blocks;
        9. final: it is used when we want our members to be declared as final i.e, by using final for class we cannot extend the class, if we implement to a method we cannot override, if we implement for a variable we cannot change its value, final can be implemented for classes, variables, methods;
       10. transient: transient keyword is used in the context of serialization, in a network to travel an object form one place to another place we use transient keyword, it can be implemented only for variables;
       11. volatile:
       12. native: this is used to declare a method that is implemented in native code using java native interface this method is written in a language other than java, the native keyword is a modifier that can only be applied to methods;
         */
        /*
        exception handling (5):
        1. try: try block contains code that might throw an exception, it usually used to wrap code that could potentially cause exception;
        2. catch: the catch is used to handle the exception that occur in the associated try block, it catches the exception and the program to continue running;
        3. finally: finally block consists a code that is always executed after the try and catch block regardless of whether an exception thrown or not;
        4. throw: it is used to throw an exception explicitly, it can be used to throw both checked and unchecked exception;
        5. throws: throws is used in a method signature to declare that the method can throw one or more exceptions;
         */
        /*
        conditionals (6):
        1. if: it contains(specifies) a block of code to be executed if a specific condition is true;
        2. else: it contains a block of code to be executed if the same condition is false;
        3. if-else: it used to specify a new condition to test if the first condition is false;
        4. switch: it contains alternative blocks of code to be executed based on the value of an expression;
        5. case: it is used with in a switch statement to specify a block of code to be executed if case matches the switch expression;
        6. default: it is used in a switch statement to specify a block of code to be executed if none of the cases matches the switch expression;
        */
        /*
        loops (5):
        1. for: used to create a loop that is executed for a specific number of times;
        2. while: used to create a loop that executes continuously as long as the specified condition is true;
        3. do-while: it is same as the while loop but the condition is checked after the execution of the body, so here the loop body is executed at least once;
        4. break: the break keyword is used to exit the loop immediately regardless of the loop condition;
        5. continue: continue keyword is used to skip the current iteration of the loop and proceed to the next iteration;
         */

    }
}
