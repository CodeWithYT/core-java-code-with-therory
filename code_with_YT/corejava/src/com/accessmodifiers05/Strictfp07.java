package com.accessmodifiers05;
/*
strictfp modifier:
    - strictfp is a modifier used to restrict the precision and rounding of floating point calculations, it was introduced from java17 by this the java became 100% platform independent
                                                            *********** scope ****************
 class:
    - we can declare class as strictfp to get the exact precision values but from java 17 there is no necessary to use strictfp as java itself implemented the precision;
 inner class:
    - we can declare inner class as strictfp to get the exact precision values but from java 17 there is no necessary to use strictfp as java itself implemented the precision;
 methods:
    - we can declare methods as strictfp to get the exact precision values but from java 17 there is no necessary to use strictfp as java itself implemented the precision;
 variables:
    - we cannot declare variables as strict as it stores the constant values;
 blocks:
    - we cannot declare blocks as strictfp, applying strictfp to a block would not make sense because blocks are not standalone units of execution they are part of methods or constructors;
 constructor:
    - we cannot declare constructor as strictfp, Constructors are used to initialize objects and set up the initial state of an instance. They do not perform floating-point calculations that would require the precision control provided by strictfp;
 interface:
    - we can declare interface as strictfp, Ensures that all floating-point operations within the interface’s methods produce consistent results across different hardware and platforms, but from java 17 there is no necessary to use strictfp as java itself implemented the precision;

 */
/*  modifier        class      inner class      methods      variables       blocks      constructors        interfaces
    strictfp         yes;          yes;           yes;          no;            no;           no;                yes;
 */
public strictfp class Strictfp07 {

    public static void main(String[] args) {

    }
}
