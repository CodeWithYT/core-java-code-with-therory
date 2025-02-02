package com.logicalStatementsAndOperators04;

import java.util.Scanner;

public class SwitchCases04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the color of the fruit: ");
        String name = sc.next();

//        The switch statement in Java is used to execute one block of code among many options based on the value of an expression;
//        the syntax goes like switch(input variable/condition){{case value to be matched: statement};
        switch (name){
            case "yellow":
                System.out.println("banana");
                break;      // the break statement is mandatory to break the condition if break is not declared the condition will execute the condition matched statement and also the default statement;
            case "red":
                System.out.println("apple");
                break;
            case "green":
            System.out.println("guava");
                break;
            case "black":
            System.out.println("grapes");
                break;
//                the default case is executed when the condition does not match with any cases;
            default:
                System.out.println("no data found!!!");
        }

    }
}
