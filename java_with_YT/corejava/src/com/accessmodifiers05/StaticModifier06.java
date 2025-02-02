package com.accessmodifiers05;

/*
static modifier:
    - whenever the data is not changing for object to object then we can declare that fields as static means if we want to share our data to different type of multiple object we declare that fields as static;
                                                            *********** scope ****************
 class:
    - we cannot declare class as a static as the class consists of data members if we declare class as static we cannot instantiate the class without instantiation we cannot call the data members present in the class:
 inner class:
    - yes you can declare the inner class as static and the class is know as the static nested inner class, we can create the instance of static nested class without creating the instance of the outer class;
 methods:
    - yes we can declare the methods as static, if we want to load the methods into the memory before creating the object or if we want to call the methods without creating objects then we declare the methods as static;
 variables:
    - yes we can declare the variables as static whenever the variable is declared as static it means the variable belongs to the class itself rather than to the any specific instance of the class and can be accessed directly using the class name;
 block:
    - yes we can declare blocks as static this is known as static initialization block, static blocks are used to initialize static variables or perform static initialization task,  before the loading of the main method if we want to load any connection related information then we can declare that information into static block, static block is executed only once when the class is loaded into the memory, If a class has multiple static blocks, they are executed in the order they appear in the source code.;
 constructors:
    - we cannot declare constructors as a static, constructor are special methods used to initialize objects, they are called when the instance of the class is created. Since constructor are tied to object creation they inherently belong to instance of the class not the class itself;
 interfaces:
    - no we cannot declare interface as static, but we can declare methods in the interface as static, Interfaces are meant to define a contract for classes to implement. They are inherently abstract and do not hold any state or instance-specific behavior that would necessitate a static context;

 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
     static          no;          yes;           yes;           yes;          yes;           no;                no;
 */
public class StaticModifier06 {
    static class QWERTY{
        int a = 1;
    }
    public static void main(String[] args) {
        QWERTY q = new QWERTY();
        q.a=22;
        System.out.println(q.a);
    }
}
