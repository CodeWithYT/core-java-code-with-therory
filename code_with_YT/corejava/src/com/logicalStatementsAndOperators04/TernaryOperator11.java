package com.logicalStatementsAndOperators04;
/*
ternary operator:
    - The ternary operator in Java is a concise way to perform conditional operations. It is the only operator in Java that takes three operands, hence the name “ternary.” It acts as a shorthand for the if-else statement and is often used to make the code more readable and compact;
                            variable = (condition) ? expression1 : expression2;
    - condition: A boolean expression that is evaluated.
    - expression1: The value assigned to the variable if the condition is true.
    - expression2: The value assigned to the variable if the condition is false.
 */
public class TernaryOperator11 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum value is " + max);
/*      The condition (a > b) is evaluated.
        If 'a' is greater than 'b', max is assigned the value of a.
        Otherwise, max is assigned the value of b
 */
        int number = 49;
        boolean isEven = (number % 2 == 0) ? true : false;
//      This example checks if a number is even and assigns true to isEven if the condition is met, otherwise false.
    }
}
