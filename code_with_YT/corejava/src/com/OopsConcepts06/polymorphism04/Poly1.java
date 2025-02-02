package com.OopsConcepts06.polymorphism04;

/*
    why we need polymorphism?
        - for flexibility and loosely coupling we need polymorphism;

    what is polymorphism?
        -poly means many and morphism means forms with different specifications so, one form with different entity is known as polymorphism;

    we have two type of polymorphisms:
        - compile time (or) static polymorphism which is method overloading;
        - run time (or) dynamic polymorphism which is method overriding;

=====================================================================================================================================================

                    *************************** method overriding *******************************

    we can achieve method overriding through inheritance only;
    why - whenever we are unsatisfied with the parent class functionalities then we can go and write same method with different functionality in child class;

    method overriding rules:
        1. method signature must be same that is method name and arguments must be same;
            note: method return type is not part of methods signature;
        2. method return type must be same whenever the return type is primitive but whenever the return type is object type no need to be same it can be co-variant type also;
            co-variant type: means if the return type of the method in parent class is an object then the return type of the overridden method in the child class can be the subclasses of the object;
        3. method scope shouldn't be reduced that is
            if parent class method is public then child class method must be public;
            if parent class method is protected then child class method can be protected or public;
            if our parent class method is default then child class method can be default or protected or public;
            if our parent class method is private then we cannot override the method if we declare same methods as private in parent and child class then they are considered as different methods;
                        ********** private < default < protected < public ****************
        4.   final methods cannot be overridden;
        5. we cannot override the static methods of the parent class in child class, but we can say it as method hiding;
        6. if the parent class method throws any exception then child class method no need to throw any exception, but if child class method throws any exception then parent class must throw the same exception or its parent class;
        7. if the parent class methods are abstract then we need to override and implement the abstract methods;

=====================================================================================================================================================

                    *************************** method overloading *******************************

    within the same class if we have same methods with different arguments we can say it as overloaded method;
    why - for keeping the specifications same even though we pass n number of arguments in different way then we go for method overloading;

        best example: System.out.println();
 */


public class Poly1 {

    public static void main(String[] args) {

        Car c = new Car();
        c.engine();
        c.colour();
        Vehicle.qw();
        Car.qw();

        Bike b = new Bike();
        b.engine();
        b.colour();

        Poly1 p = new Poly1();
        p.meth(2,2.3f);
//        p.meth(2.5f,2);

    }


    void meth(int a, int b){}
    void meth(float a, float b){}
    void meth(int a, float b){}

    void meth(float a, int b){}

}

class Vehicle {

    void engine(){
        System.out.println("im an engine");
    }

    void colour(){
        System.out.println("im a colour");
    }

    void seats(){
        System.out.println("im seats");
    }

    void length(){
        System.out.println("im length");
    }
    static void qw(){
        System.out.println("hello");
    }

}

class Car extends Vehicle {

    static void qw(){
        System.out.println("hello from child");
    }

    @Override
    void engine() {
        System.out.println("im diesel engine");
    }

    @Override
    void colour() {
        System.out.println("im a red car");
    }

    @Override
    void seats() {
        System.out.println("i have four seats");
    }

    @Override
    void length() {
        System.out.println("5 meters long");
    }
}

class Bike extends Vehicle{

    @Override
    void engine() {
        System.out.println("im a petrol engine");
    }

    @Override
    void colour() {
        System.out.println("im a black bike");
    }

    @Override
    void seats() {
        System.out.println("i have 2 seats");
    }

    @Override
    void length() {
        System.out.println("im 2 meters long");
    }
}