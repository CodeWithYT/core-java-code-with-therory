package com.ExceptionHandling;

import java.io.IOException;

public class Parent {
    public int div (int n) {
        return 120/n;
    }
    public int div (int m, int n) throws ArithmeticException{
        return n/m;
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.div(6);
        System.out.println(p.div(0,2));
    }
}
//class child extends Parent{
////    @Override
////    public int div(int n) throws IOException {
////        return 120/(n);
////    }
////    @Override
////    public int div (int m, int n)  throws ArithmeticException{
////        return n/m;
////    }
//public int div (int m, int n) {
//    return n/m;
//}
//}
