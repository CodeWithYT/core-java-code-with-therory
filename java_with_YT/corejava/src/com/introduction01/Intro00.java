//understanding the terminology in java

package com.introduction01;
//package is a collection of related classes and interfaces into a common namespace, with package we have several benefits like
// - it prevents the naming conflicts by ensuring that the class names within the package are unique;
// - our classes and interfaces will be organized at one place and maintainability is achieved;
// - and we have access control as the classes with in the same package can access other package's private, default and protected members;

//com.introduction - com is the folder name and the "." takes into the inside of the com folder, inside com folder, folder name called introduction is created inside that our java source file is created.

public class Intro00 {
//public is access modifier to access our class, fields, methods extra from anywhere outside the class or package we use public keyword;
//class is the name group of properties and function, it's the blueprint or template to create instances(object) of the class;
//Intro00 is the name of the class, the name the class must be same as the source file because the .java file is the class itself;


    public static void main(String[] args) {
    //static is keyword used when we want to call a method/function without creating an instance or object, when we declare static before the members it is associated with the class itself we can call the static members using the name of the class without creating an object;
    //void is a keyword which severs as a return type if our method do not return any value we use void;
    //main is a method in java it is the entry point for executing java programs, when we run a java program the JVM looks for the main method to begin execution;
    //String[]args it is the command line argument the arguments that we pass in the command line are stored as a type String;

        System.out.println("Hello World");
        //System is a class in java in System there is variable called out which is out type print stream in that there is a method called println it prints the value of the type we provided, the System.out is the default output stream,here we provided type is String, so it prints the value of the string we entered;
    }
}
