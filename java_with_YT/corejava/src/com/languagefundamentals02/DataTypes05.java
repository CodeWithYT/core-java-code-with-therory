package com.languagefundamentals02;

public class DataTypes05 {
    public static void main(String[] args) {
/*        //    byte b = 128;          // throws error max value stored in byte is 127;
        byte b = (byte) 128;        // it is known as type casting, but the max value stored in byte is -128 to 127, so it will execute in cyclic process;
        byte b1 = (byte) 130;       // it checks the difference between the max value stored and the give exceeded value and prints the number which is at the value cyclically, i.e, 127-130 = -3 so after the 3 digits the lowest number is -126;
        byte b4 = (byte) 256;       //0;
        byte b5 = (byte) 257;       //1;
        short s = (short) (32768);   // the max value that can stored in short is -32768 to 32767, so it is also executes in cyclic way;
        System.out.println(b); //-128
        System.out.println(b1); // -126
        System.out.println(b4); // 0
        System.out.println(b5); // 1
        System.out.println(s);
*/
//==================================================================================================================================================================
/*
//      int i = (int)(2147483647);   the maximum value that can be stored in int is -2147483648 to 2147483647, so it cannot be cast because the byte, short, char can be promoted to int so int will be promoted only to int;
//      long l = (long)(9999999999);  compile time error number too large;

//      to store larger values than long we use "BigInteger" class it takes the string value of the big integer and converts it's into the big integer;
        BigInteger bi = new BigInteger("5555555555555555555555555555555555555");
        BigInteger c = new BigInteger("45");
        System.out.println(bi);//5555555555555555555555555555555555555
//      to add or to do any operations with the values stored in big integer class we need to call the methods of the big integer here it is add();
        System.out.println(bi.add(c));
*/
//====================================================================================================================================================================
/*
//      we can store single character, unicode, and also integers which are known as ASCII values;
        char ch = 'a';
        char ch1 = '\u0021';
        char ch2 = 64;
//      as we store int in a character in the same way we can store char in int;
//      int p = 's';    // store the ASCII value;
 */
//=====================================================================================================================================================================
//        Integer in = 69; // auto-boxing;
//        int t = in;      // auto un-boxing;
//=====================================================================================================================================================================
//        ******************** TYPE PROMOTION **********************
//        byte b = 44;
//      byte c = b+44; //throws error because if any operation done on byte it automatically promotes the value into int;
//        float f = 88; //we stored int in float but if we print the value it is automatically promoted to float;
//        short s =34+b; //the value stored in short is automatically promoted to int;
//======================================================================================================================================================================
    }
}
