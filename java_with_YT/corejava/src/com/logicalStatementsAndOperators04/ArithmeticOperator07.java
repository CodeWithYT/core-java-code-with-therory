package com.logicalStatementsAndOperators04;
/*
    arithmetic operators:
       - Arithmetic operators in Java are used to perform basic mathematical operations.
                  +, -, *, /, %
 */

public class ArithmeticOperator07 {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Addition (+)
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction (-)
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication (*)
        int product = a * b;
        System.out.println("Product: " + product);

        // Division (/)
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus (%)
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // Increment ()
        a++;
        System.out.println("Incremented a: " + a);

        // Decrement ()
        b--;
        System.out.println("Decremented b: " + b);

    }
}