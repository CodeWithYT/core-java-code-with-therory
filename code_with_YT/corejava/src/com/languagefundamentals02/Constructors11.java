package com.languagefundamentals02;

//    why we use constructor?
//    - to initialize object we need constructor
//    - to initialize data members into the memory when the object is created;
//    - to pass the values while creating the object we need parameterized constructor;
//=========================================================================================================================================================
//    what is constructor?
//    - a constructor is a special method without any return type and of the class name itself;
//     we have five types of constructors:
//      - default constructor -> if there is no constructors present in the class the "compiler" automatically creates a default constructor;
//      - no args constructors -> the constructor which we create explicitly without any arguments.
//      - parameterized constructors -> the constructor which we create explicitly with arguments and these need to be initialized when the object of the class is created;
//      - constructor chaining -> this() (this of), super()(super of);
//      - copy constructor -> if we want our objects to use the same data of one object we use copy constructor;
//                                          *******NOTE:******
//      we are able to create an objects because of the default constructor which is created by the compiler;
//      if we create a constructor explicitly which is of no args or parameterized then the compiler will not generate any default constructor;
//========================================================================================================================================================
public class Constructors11 {

    int age;
    String name;

//  this is the no arg constructor, which will be executed when the object of the class is created;
    Constructors11(){
        System.out.println("im a no arg constructors");
    }

//  parameterized constructor, to call this constructor we need to pass the values while initializing the object;
    Constructors11(int age, String name){
        this.age = age; // "this" keyword is used to invoke the current object in the class;
        this.name = name;
//
//                                          *******NOTE:******
//        we can use different names for the argument variables but for the readability we use same name of the variable which needs to be initialized;
//        if there are no constructors like above present in the class the compiler automatically creates a default constructor to initialize object
//
    }

    public static void main(String[] args) {
        Constructors11 obj = new Constructors11();  //constructor with no args will be called;
        System.out.println(obj.age);  //0;
        System.out.println(obj.name); //null;

        Constructors11 obj1 = new Constructors11(22, "tarun"); //constructor with args will be called;
        System.out.println(obj1.age); //22;
        System.out.println(obj1.name); //tarun;

    }
}
