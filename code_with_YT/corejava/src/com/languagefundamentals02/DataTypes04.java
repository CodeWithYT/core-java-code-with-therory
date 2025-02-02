package com.languagefundamentals02;

import java.util.ArrayList;

public class DataTypes04 {
    byte by;
    short sh;
    int in;
    long lo;
    float f;
    double d;
    char ch;
    boolean bo;
    public static void main(String[] args) {
        /*
        we have two data types they are:-
        1. primitive data types;
        2. non-primitive datatype(object data type);
        -> primitive data types:- these are datatype which are not breakable, due these data types java is not 100% case-sensitive they are 8 types;
                1) byte: takes 1 byte, value ranges from -128 to 127, default value 0;
                2) short: takes 2 bytes, value ranges from (-2^16)/2 to ((2^16)/2)-1, default value 0;
                3) int: takes 4 byte, value ranges from (-2^32)/2 to ((2^32)/2)-1, default value 0;
                4) long: takes 8 byte, value ranges from (-2^64)/2 to ((2^64)/2)-1, default value 0;

                5) float: takes 4 byte, value ranges from 1.4*10^-45 to 3.4028235 * 10^38 default value 0;
                6) double: takes 8 byte, value ranges from 2.2250738585072014 * 10^-308 to 1.7976931348623157 * 10^308, default value 0.0;

                7) char: takes 2 bytes, value ranges from 0 to 65535(2^16-1), default value \u0000;
                8) boolean: value can be true or false, size depends on JVM, default value false;

        -> non-primitive data-types:
        these are the user defined or pre-defined data-types, classes, interfaces etc.
        */
//============================================================================================================================================================
        DataTypes04 obj = new DataTypes04();
        System.out.println(obj);
/*
        // Default value of data-types;
        // if we print this as the instance variables are not initialized the default values of the number based data types, in this case it prints (0,0,0,0);
        System.out.println(obj.by); //0;
        System.out.println(obj.sh); //0;
        System.out.println(obj.in); //0;
        System.out.println(obj.lo); //0;

        // if we print this as the instance variables are not initialized the default values of the floating based data types, in this case it prints (0.0,0.0);
        System.out.println(obj.f); //0.0;
        System.out.println(obj.d); //0.0;

        // the default value of char (empty space will be printed) it is unicode '\u0000', will be printed;
        System.out.println(obj.ch);

        //the default value of the boolean is printed (false);
        System.out.println(obj.bo);

        // every class is an object the default value of any object is "null";
        System.out.println(obj);
*/
//===========================================================================================================================================================
/*
//        *************** MIN and MAX values of data-types *************
//      System.out.println("Byte Max Value: " + ((1 << 7) - 1));
        System.out.println("Byte MIN and MAX value: "+Byte.MIN_VALUE + " to "+Byte.MAX_VALUE);
        System.out.println("Short MIN and MAX value: "+Short.MIN_VALUE + " to "+Short.MAX_VALUE);
        System.out.println("Integer MIN and MAX value: "+Integer.MIN_VALUE + " to "+Integer.MAX_VALUE);
        System.out.println("Long MIN and MAX value: "+Long.MIN_VALUE + " to "+Long.MAX_VALUE);
        System.out.println("Float MIN and MAX value: "+Float.MIN_VALUE + " to "+Float.MAX_VALUE);
        System.out.println("Double MIN and MAX value: "+Double.MIN_VALUE + " to "+Double.MAX_VALUE);
        System.out.println("Character MIN and MAX value: "+Character.MIN_VALUE + " to "+Character.MAX_VALUE);
*/
//==========================================================================================================================================================
/*
//      to display decimal values up to 5 to 6 we use float, to represent the value of float we need to assign "F" (or) "f" at the suffix of the value;
        float f = 2.04f;
//      to display decimal values up to 15 to 16 we use double, to represent the value of double no need to assign "D" (or) "d" at the suffix of the value;
        double d = 2.04444555;
 */

    }

}
