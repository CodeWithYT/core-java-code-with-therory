package com.languagefundamentals02;
/*
Rules:
1. name of the constructor must be the same as the class name;
2. must be of no return type;
3. if there is a parameterized constructor in a class to create an object of the class with no parameters there must be a no arg constructor present in the class;
4. the access modifiers which we can assign for constructors are as follows:
    - public
    - private
    - default
    - protected
5. if there is no access modifier for a constructor by default it takes default;
6. with a public class and constructor with no access modifier(default) we can create object of the class with in the class and within the same package only;
7. with a public class and constructor with no access modifier(default) to create object of the class in different package we must declare the constructor as public;
8. we can declare constructor as private, but if we declare constructor as private we cannot create the object of the class from outside the class of same package also from the other packages however we can create instance of the class within the class itself by using a static method or design pattern like singleton;
   singleton pattern: the singleton pattern ensures that only one instance of the class is created and provides a global point of access to it;
*/

public class ConstructorsRules13 {

    protected ConstructorsRules13(){
        System.out.println("im constructor");
    }
    public static void main(String[] args) {
        ConstructorsRules13 c = new ConstructorsRules13();
    }
}
