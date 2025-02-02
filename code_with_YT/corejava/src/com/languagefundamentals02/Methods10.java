package com.languagefundamentals02;

public class Methods10 {
//    here the return type is wrapper object and the arguments are of primitives, so the primitives are promoted to wrapper object, and it is called "AUTO-BOXING";
    static Integer wrap (int a, int b){
        return a+b;
    }
//    here the return type is primitive and the arguments are wrapper object, so the wrapper object is converted to primitive it is known as the "AUTO_UNBOXING";
    static int unWarp(Integer a, Integer b){
        return a-b;
    }
//    byte, short, char when performed operations on it, they are automatically promoted to int, so we cannot return the respected return type;
/*
    static Byte b(Byte a,Byte b){
        return a+b;
    }
    static Short s(short a, short b){
        return a/b;
    }
    static Character c(char a, char b){
        return a*b;
    }
    static Boolean bo(boolean a, boolean b){
        return a==b;
    }
 */
//  we know every class is a child of object, so we can create a method of return type object and take objects as arguments;
    static Object aa(Object a,Object b){
//      we cannot perform operation on objects;
//        return (a+b); ❌
        return (a+""+b); //✔️
    }
    public static void main(String[] args) {
        System.out.println(wrap(10,10));
        System.out.println(unWarp(300,100));
        System.out.println(aa(10,20));

    }
}
