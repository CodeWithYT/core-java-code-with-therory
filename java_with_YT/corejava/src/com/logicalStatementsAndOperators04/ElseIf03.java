package com.logicalStatementsAndOperators04;

import java.util.Random;
import java.util.Scanner;

public class ElseIf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        if (age > 13){
            System.out.println("you are in teenage");
        }
        if (age >19){
            System.out.println("you are adult");
        }
        if (age > 60){
            System.out.println("you are senior citizen");
        }
// here we used if conditions so the input will be checked by all the if conditions and the statements in the if conditions will execute if the condition satisfies;
// if we want to execute only the 1st satisfying statement and then to exit we use else if condition as below;
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        sc.close();
        if (marks > 33){
            System.out.println("pass");
        }
        else if (marks >60){
            System.out.println("grade D");
        }
        else if (marks > 70){
            System.out.println("grade B");
        } else if (marks > 80) {
            System.out.println("grade A");
        }else System.out.println("fail");
//      there are some draw backs in if else and else if conditions so to overcome this we have switch cases;
    }
}
