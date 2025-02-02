package com.logicalStatementsAndOperators04;

import java.util.Scanner;

public class IfAndElse01 {
    public static void main(String[] args) {
//to check the entered value or the value which exists or a desired output of a function satisfies the required condition we use "if" condition;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int i = sc.nextInt();
//        syntax of "if":
        if (i>18)
            System.out.println("Yes!! You Are Eligible");
//          we can declare statements of the if condition without using curly braces if there is only one statement need to be executed;

        if (i>70)
            System.out.println("NO!! You Are Not Eligible");
            System.out.println("Maximum Age Exceed :(");
//           if the statements in the if condition are more than one without declared in the curly braces both the statements will be executed if the required condition matches but if the value doesn't match the required condition the last statement in the if condition is executed which need to be executed only when the value matches the condition so to resolve this problem we declare the statements inside the curly braces like below;

        if (i<18){
            System.out.println("you are too young...");
            System.out.println("try after when you are 18!!");
        }
//        we can use "if" condition without "else";
//        the else condition is used to execute if the condition inside the "if" statement is false in simple language if the condition fails then execute else;
        else {
            System.out.println("enter valid age!!");
        }
    }
}
