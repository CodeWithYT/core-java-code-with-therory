package com.logicalStatementsAndOperators04;

import java.util.Scanner;

public class NestedIfElse02 {
    public static void main(String[] args) {
// the if and else condition inside any if and else condition is known as the nested if and else conditions;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Matrimony!!!");
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if (age > 25){
            System.out.println("You are eligible!!!");
            System.out.println("enter your annual income: ");
            double ai = sc.nextDouble();
            if (ai > 500000){
                System.out.println("your annual income is nice!!!");
                System.out.println("enter your net wealth: ");
                double prop = sc.nextDouble();
                if (prop > 5000000){
                    System.out.println("eligible based on property");
                    System.out.println("please enter your height: ");
                    double height = sc.nextDouble();
                    if (height > 5.6){
                        System.out.println("enter you color: ");
                        String color = sc.next();
                        if (color.equals("white")){
                            System.out.println("color matched");
                            System.out.println("finding your perfect match....");
                        }else {
                            System.out.println("your are not fair :(");
                        }
                    }else {
                        System.out.println("you are short :(");
                    }
                }else {
                    System.out.println("Sorry your wealth is low :(");
                }
            }
        }else {
            System.out.println("Sorry you are under aged :(");
        }
    }
}
