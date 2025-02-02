package com.languagefundamentals02;

public class Literals06 {
    public static void main(String[] args) {
//        literals are sequence of characters (number, decimal, alphabets) and the literals are the constant values that are stored in variables;
//        -> integral literals
//                - decimal literals - base 10 -> 0 to 9;
//                - octal literals - base 8 -> 0 to 7;
//                - hexadecimal literals - base 16 -> 0 to 9 and a to f (10 to 14);
//        - floating point literals
//        - character literals
//        - boolean literals
//        - String literals
//        - null literals
        int a = 100; // here "int" is a data type, "a" is variable, 100 is the literal of int type means it's an integral literal;
        String s = "tarun"; // here "tarun" is the String literal;
//=======================================================================================================================================
//       ************************ decimal literals ***************************
        int i = 123; // integral literal;
        System.out.println(i);
//=======================================================================================================================================
//       ************************* octal literals *******************************
        int i1 = 0123; // octa literal;
//      int i2 = 0128; // compile time error octal number can contain 0 to 7;
        System.out.println(i); //123;
        System.out.println(i1); //83;
//      explanation: 0*8^3 + 1*8^2 + 2*8^1 + 3*8^0 = 83;

        float f = 0123; // the octal value is of integer type and promoted to float;
        float f2 = 0123.9f; // it's not an octal value it considered as a float and 0 is ignored, so we can not have octal literals in float;
        System.out.println(f);
        System.out.println(f2);
//=======================================================================================================================================
//       ************************* hexadecimal literals *******************************
        int i3 = 0x23; //hexadecimal literal;
        int i4 = 0X23aB; //hexadecimal literal;
//      int i5 = 0X23Cg; //error cannot resolve symbol because hexadecimal can only contain up to "0" to "f" which is 0 to 15;
        System.out.println(i3); //35;
//        explanation: 0*16^2 + 2*16^1 + 3*16^0;
        System.out.println(i4);
//        explanation: 0*16^4 + 2*16^3 + 3*16^2 + 10*16^1 + 11*16^0;

        float f3 = 0x33a; // the hexadecimal value is of integer type and promoted to float;
        float f4 = 0x33af; // the hexadecimal value is of integer type and promoted to float here f is considered as a value of 15;
//      float f5 = 0x33af.0f; // we can not store hexadecimal in a float of float type because hexadecimal contains a to f values so f is considered as 15;
//========================================================================================================================================






    }
}
