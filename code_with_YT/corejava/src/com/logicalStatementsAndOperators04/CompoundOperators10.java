package com.logicalStatementsAndOperators04;
/*
Compound operators:
        - compound operators in Java provide a shorthand way to perform an operation and assign the result to a variable. They combine an arithmetic or bitwise operation with an assignment.
 */

public class CompoundOperators10 {
    public static void main(String[] args) {

        int a = 5;
        a += 3;  // Equivalent to a = a + 3; a becomes 8
        int x = 0;
//        x = x + 4.5;  // throws error;
        x += 4.5; // 4;

        int b = 5;
        b -= 3;  // Equivalent to a = a - 3; a becomes 2

        int c = 5;
        c *= 3;  // Equivalent to c = c * 3; c becomes 15

        int d = 6;
        d /= 3;  // Equivalent to d = d / 3; d becomes 2

        int e = 5;
        e %= 3;  // Equivalent to e = e % 3; e becomes 2

        int f = 5;  // 0101 in binary
        f &= 3;  // Equivalent to f = f & 3; f becomes 1 (0001 in binary)


        int g = 5;  // 0101 in binary
        g |= 3;  // Equivalent to g = g | 3; g becomes 7 (0111 in binary)

        int h = 5;  // 0101 in binary
        h ^= 3;  // Equivalent to h = h ^ 3; h becomes 6 (0110 in binary)

        int i = 5;  // 0101 in binary
        i <<= 1;  // Equivalent to i = i << 1; i becomes 10 (1010 in binary)

        int j = 5;  // 0101 in binary
        j >>= 1;  // Equivalent to j = j >> 1; j becomes 2 (0010 in binary)

        int k = -5;  // 11111111111111111111111111111011 in binary (32-bit representation)
        k >>>= 1;  // Equivalent to k = k >>> 1; k becomes k large positive number
    }
}
