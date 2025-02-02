package com.languagefundamentals02;

//constructor chaining
class Monkey{
    int age;
    String lang;

    Monkey(){
//      "this of" keyword is used to invoke the current class constructor which can be of type no args or parameterized;
        this(33,"ff ff");
        System.out.println("im monkey 🐒");
    }

    Monkey(int age,String lang){
//  we cannot use "this-of" and "super-of" with in the same class as in the above no args constructors we called parameterized constructor by passing args in the this-of keyword, so if we call the no args constructor in the parameterized constructor due to recursive call ambiguity occurs;

//        this();       //if we uncomment this line without commenting line 10 throws recursive error;

//      this keyword is used to invoke the current object within the class;
        this.age = age;
        this.lang = lang;
        System.out.println(this.age);
        System.out.println(this.lang);
    }
}

class Human extends Monkey{
    String name;
    int age;
    Human() {
//  the constructor call must be the 1st line inside the constructor, and we cannot call any constructors in the methods they can be called within constructors;
        super();

//  we cannot call two constructors at a time within the constructor as below, we use super-of keyword to call the parent class no arg constructor but if a class extends a class automatically without using the super-of keyword the parent class no arg constructor will be executed but if we want to call the super class parameterized constructor we use super-of and pass the parameters in it like called below;
//        super(22, "heehaw");

//    we cannot use this-of, super-of keyword within their same respected constructors like below as it leads to recursive call;
//        this();

        System.out.println("im human 🧑");

//      "super." keyword is used to invoke the parent class data;
        System.out.println(super.age);

    }
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class constructorsChaining12 {
    public static void main(String[] args) {

//        Human obj = new Human();
        Human h = new Human("tarun", 22);
        System.out.println(h.age);
        System.out.println(h.name);


    }
}
