package com.languagefundamentals02;

// 1234567 - 1,2,3,4,5,6,7
class Book{
//    static {
//        System.out.println("im static block");
//    }
    Book(){
        System.out.println("Im book");
    }
    Book(String name){
        System.out.println(name);
    }
}
class Pen extends Book{
    Pen(){
        this("Blue");
        System.out.println("im pen");
    }
    void Pen(){
        System.out.println("im void");
    }
    Pen(String color){
        this(1,2);
//        super("red");
        System.out.println("im "+ color+" pen");
    }
    Pen(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    void sum(){
        System.out.println("im addition");
    }
}
public class Solve {
     static  int n=0;
//    static int reverse(int num){
//        if (num==0){
//            return num;
//        }else {
//            int rev = 0;
//            int r = num%10;
//            rev = rev*10+r;
//            System.out.print(rev);
//            reverse(num/10);
//            num /= 10;
//            }return -1;
//    }
    static void reverse(int n){
        int i =n;
        int m=n;
        int t = n;
        int rev = 0;
        int multi = 0;
        while (i>0){
            int rem = i%10;
            System.out.print(rem+", ");
            i/=10;
        }
        System.out.println();
       while(m>0){
           int rem2 = m%100;
           System.out.print(rem2+", ");
           m/=10;
       }
        System.out.println();
       while(t>0){
           int rem2 = t%1000;
           System.out.print(rem2+", ");
           t/=10;
       }
    }
    public static void main(String[] args) {
//        int n = 1234567;
//        reverse(n);
//        System.out.println();
        new Pen();
//        p.Pen(); //we created a object of pen but not initialized, so to call the method Pen(); we need create a object reference variable;



    }
}
