package com.logicalStatementsAndOperators04;
/*
  conditional operators:
        ==, <=, >=, != ;
 */
public class RelationalOperators09 {
    public static void main(String[] args) {

        int a = 1;
        int b = 4;
//        "==" operator is used to check if the two reference variables pointing to the same object;
        if (a == b){
            System.out.println(true);
        }
//        "<=" operator is used to check if the value on the left hand side is less than or equal to the right hand side value;
        if (a<=b){
            System.out.println(true);
        }
//        ">=" operator is used to check if the value on the left hand side is greater than or equal to the value on the right hand side;
        if (a>=b){
            System.out.println(true);
        }
//        "!=" operator is used to check is the value is value on the value on the right hand side is not equal to the value on the right hand side;
        if (a!=b){
            System.out.println(true);
        }

    }
}
