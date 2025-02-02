package com.languagefundamentals02;

public class methods09 {

//  the int cannot implicitly convert to char in methods;
    static char symbol2(int a){
//        we need to type cast int to char;
        return (char)a;
    }
    static int symbol3(char a){
        return a;
    }

//   method is of return type int, so it must return a value of type int;
    int age(){
//        int a = 44; allowed
        return 44; //a, allowed
    }
    String sum(int a, char b){
        return "my age" + a + b;
    }
//   we can return char type for int return type it prints its ASCII value;
    int king (int a, char b){
        return 'a'+b;
    }
//   as we know if we perform any operation on byte it is automatically promoted to int
//    byte b(byte a, byte b){
//        return a+b;
//    }
//    byte ==> short==> int ==> long ==> float ==> double;
    int i(byte a, byte b){
        return a+b;
    }

    public static void main(String[] args) {
        methods09 obj = new methods09();
        System.out.println(obj.king(95, 'a'));

    }
}
