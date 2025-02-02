package com.logicalStatementsAndOperators04;
/*
bit wise operators:
    - & (AND)
    - | (OR)
    - ^ (XOR)
    - ~ (complimentary)
    - >> (right shift)
    - << (left shift)
    - >>> (unsigned right shift)
*/
public class BitwiseOperators08 {
    public static void main(String[] args) {

//        & (AND):
//        this operator returns 1 only if the both corresponding bits of the operand are 1 otherwise it returns 0;
        int a = 5;  // 0101 in binary
        int b = 7;  // 0111 in binary
        int result = a & b; // 0101 in binary, which is 5;
/*        observation:
             - when you & 1 with any number, the digit remain same;
                        example: 0111 & 1111 = 0111;
 */
//======================================================================================================================
//        | (OR):
//        this operator returns 1 if at least one of the corresponding bits of the operand are 1 otherwise it returns 0;
        int c = 6;  // 110 in binary -->  0110
        int d = 8;  // 1000 in binary --> 1000
        int value = c | d; // 1110 in binary, which is 14;
/*        observation:
             - when you | 0 with any number, the digit remain same;
                        example: 1110 | 0000 = 1110;
 */
//======================================================================================================================

//        ^ (XOR) (if and only if):
//        this operator return 1 if and only if one of the corresponding bits of the operand is 1 i.e, one and only one should be true if both are true/false it returns 0;
        int e = 9;  // 1001 in binary --> 1001
        int f = 3;  // 11 in binary   --> 0011
        int ans = e ^ f; // 1010 in binary, which is 10;
/*      observation:
            - if we XOR any number with 1, we get the compliment of that number;
                        example: 1001 ^ 1111 = 0110;
            - if we XOR any number with 0, we number will remain same;
                        example: 0011 ^ 0000 = 0011;
            - if we XOR any number with the same number the result will be 0;
                        example: 1010 ^ 1010 = 0000;
 */
//======================================================================================================================

//        ~ (complimentary):
//        This is a unary operator that inverts all the bits of the operand, turning 0s into 1s and vice versa;
        int g = 10; // 1010 in binary;
        System.out.println(~g);

//======================================================================================================================

//        >> (right shift operator):
//        This operator shifts the bits of the operand to the right by the specified number of positions, filling the leftmost bits with 0s.
        int h = 15;
        int rShift = h >> 2;
        System.out.println(rShift);
        /*explanation:
                int 32 - bit we store the value with base 2;
                2^6     2^5      2^4    2^3    2^2      2^1     2^0
                64      32        16     8      4        2        1
         now we need to right shift 15 by 2, so we need to add the values of the powers base 2 which will give the value of 15;
         here to get the sum of 15 we need to add the values of 2^3, 2^2, 2^1, 2^0;
         so we need to represent the values to be added to get 15 as 1's and remaining as 0;
                2^6     2^5      2^4    2^3    2^2      2^1     2^0
                64      32        16     8      4        2        1
                0       0         0      1      1        1        1
        now the indices move to the right side by 2 as the right shift for 2 and the empty indices are replaced by 0's;
                2^6     2^5      2^4    2^3    2^2      2^1     2^0
                64      32        16     8      4        2        1
                0       0         0      1      1        1        1
                                  0      0      0        1        1 --> new indices after right shift of 2;
        now we need to add the values of the 1's indices and that's the answer;
                            so, 2 + 1 = 3;
         */
//        << (left shift operator):
//        This operator shifts the bits of the operand to the left by the specified number of positions, filling the rightmost bits with 0s.
        int i = 33;
        int lShift = i<<3;
        System.out.println(lShift); //264
/*        int 32 - bit we store the value with base 2;
          2^9      2^8     2^6     2^5      2^4    2^3    2^2      2^1     2^0
          256      128     64      32        16     8      4        2        1
                for explanation refer to the right shift operator above;
 */

    }
}
