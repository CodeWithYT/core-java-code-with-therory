package com.java8features.perdeffuninterf;

import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {
        String [] names = {"dhoni", "sachin", "kohli", "surya", "subhman gill"};
        Predicate <String> p1 = (s)->s.contains("h");
        Predicate<String> p2 = (s)->s.length()>6;
        Predicate<String>p3 = p1.or(p2);
        for (String name: names){
           if(p3.test(name)) {
               System.out.println(name);
           }
        }
    }
}
