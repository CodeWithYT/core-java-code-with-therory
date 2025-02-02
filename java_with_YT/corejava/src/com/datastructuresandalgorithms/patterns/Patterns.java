package com.datastructuresandalgorithms.patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("----------------------------");
        pattern2(5);
        System.out.println("----------------------------");
        pattern3(5);
        System.out.println("----------------------------");
        pattern4(5);
        System.out.println("----------------------------");
        pattern5(5);
        System.out.println("----------------------------");
        pattern6(5);
        System.out.println("----------------------------");
        pattern7(5);
        System.out.println("----------------------------");
        pattern8(5);
        System.out.println("----------------------------");
        pattern9(5);
        System.out.println("----------------------------");
        pattern10(5);
        System.out.println("----------------------------");
        pattern11(5);
        System.out.println("----------------------------");
        pattern12(4);
        System.out.println("----------------------------");
        pattern13(5);
        System.out.println("----------------------------");
        pattern14(5);
        System.out.println("----------------------------");
        pattern15(5);
        System.out.println("----------------------------");
        pattern16(5);
        System.out.println("----------------------------");
        pattern17(5);
        System.out.println("----------------------------");
        pattern17ST(5);
        System.out.println("----------------------------");
        pattern18(5);
        System.out.println("----------------------------");
        pattern19(5);
        System.out.println("----------------------------");
        pattern20(5);
        System.out.println("----------------------------");
        pattern21(5);
        System.out.println("----------------------------");
        pattern22(5);
        System.out.println("----------------------------");
        pattern23 (5);

//        final String GREEN = "\u001B[32m";
//        System.out.println(GREEN + "This is a green statement!");


    }
    static void pattern1 (int n){
        System.out.println("\tpattern 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2 (int n){
        System.out.println("\tpattern 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n){
        System.out.println("\tpattern 3");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        System.out.println("\tpattern 4");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    static void pattern5 (int n){
        System.out.println("\tpattern 5");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6 (int n){
        System.out.println("\tpattern 6");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void pattern7 (int n){
        System.out.println("\tpattern 7");
        for (int rows = 1; rows <= n; rows++) {
            for (int space1 = n; space1 > rows; space1--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= rows+rows-1; stars++) {
                System.out.print("*");
            }
            for (int space1 = n; space1 > rows; space1--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8 (int n){
        System.out.println("\tpattern 8");
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 2*n-(2*rows+1); stars > 0; stars--) {
                System.out.print("*");
            }
            for (int spaces2 = 0; spaces2 < rows; spaces2++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9 (int n){
        System.out.println("\tpattern 9");
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = n-rows-1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 2*rows+1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows = 0; rows < n ; rows++) {
            for (int spaces = 0; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 2*n-(2*rows+1); stars > 0; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10 (int n) {
        System.out.println("\tpattern 10");
        for (int rows = 1; rows <= 2 * n; rows++) {
            int cols = rows > n ? 2 * n - rows : rows;
            for (int col = 0; col < cols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11 (int n) {
        System.out.println("\tpattern 11");
        for (int rows = 1; rows <= n; rows++) {
            int start;
            if(rows % 2 == 0){
                start = 0;
            }else {
                start = 1;
            }
            for (int col = 1; col <= rows; col++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n) {
        System.out.println("\tpattern 12");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int space = (2*n)-row; space > row; space--){
                System.out.print(" ");
            }
            for (int mCol = row; mCol >= 1; mCol--){
                System.out.print(mCol);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n) {
        System.out.println("\tpattern 13");
        int num = 1;
        for(int row = 1; row <=n; row++){
            for(int col = 1; col <=row; col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n) {
        System.out.println("\tpattern 14");
        char alphabet = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++){
                System.out.print(alphabet + " ");
                alphabet++;
            }
            alphabet='A';
            System.out.println();
        }
    }
    public static void pattern15(int n) {
        System.out.println("\tpattern 15");
        char alphabet = 'A';
        for(int row = 1; row <= n; row++){
            for(int col = n; col>=row; col--){
                System.out.print(alphabet + " ");
                alphabet++;
            }
            alphabet = 'A';
            System.out.println();
        }
    }
    public static void pattern16(int n) {
        System.out.println("\tpattern 16");

        char alphabet = 'A';
        for(int row = 1; row <= n; row++){
            for (int col = 1; col<= row; col++){
                System.out.print(alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
    public static void pattern17(int n) {
        System.out.println("\tpattern 17");
        char alphabet = 'A';
        for (int row = 0; row < n; row++) {
            for (int space = n - 1; space > row; space--) {
                System.out.print(" ");
                }
                for (int col = 0; col <= row ; col++) {
                    System.out.print(alphabet);
                    alphabet++;
                }
            alphabet--;
                for (int mirror = 0; mirror < row; mirror++){
                    alphabet--;
                    System.out.print(alphabet);
                }
                alphabet = 'A';

            System.out.println();
        }
    }
    static void pattern17ST(int N) {
        // Outer loop for the number of rows.
        for(int i=0;i<N;i++){

            // for printing the spaces.
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }

            // for printing the characters.
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){

                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
    public static void pattern18(int n) {
        System.out.println("\tpattern 18");
        for(int row = 1; row <= n; row++){
            int alphabet = (char) n;
            for(int col = 1; col <= row; col++){

            }
        }
    }

    public static void pattern19(int n) {
        System.out.println("\tpattern 19");
        for(int row = 1; row <= n; row++){
            char alphabet = (char)(64+n);
            for(int col = 1; col <= row; col++){
                System.out.print(alphabet+" ");
                alphabet--;
            }
            alphabet = (char)(64+n);
            System.out.println();
        }
    }
    public static void pattern20(int n) {
        System.out.println("\tpattern 20");
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*");
            }
            for (int q = 2*i-2; q >= 1; q--){
                System.out.print(" ");
            }
            for (int j = n; j >=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int q = 2*(n-i); q >= 1; q--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern21(int n) {
        for (int row = 1; row <= 2*n; row++){
            int col = row > n ? 2*n-row : row;
            for(int columns = 1; columns <= col; columns++){
                System.out.print("*");
            }
            int space = row > n ? 2*(row-n) : 2*(n-row);
            for (int spaces = 1; spaces <= space; spaces++){
                System.out.print(" ");
            }
            for(int columns = 1; columns <= col; columns++){
//                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for (int row = 1; row <= n; row++){
            for (int columns = 1; columns <= n; columns++){
                if (row == 1 || row == n || columns == 1 || columns == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern23 (int n){
//                int top = row;
//                int right = 2*n - column;
//                int bottom = 2*n - row;
//                int left = column;
        for (int row = 1; row < 2*n; row++){
            for (int column = 1; column < 2*n; column++){
                int atEveryIndex = n - Math.min(Math.min(row,column), Math.min((2*n)-row, (2*n)-column));
                System.out.print(atEveryIndex+1 + " ");
            }
            System.out.println();
        }
    }
}
