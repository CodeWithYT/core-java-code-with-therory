package com.comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[]args) {
        EncapsulatedComparable t1 = new EncapsulatedComparable("hp",30000);
        EncapsulatedComparable t2 = new EncapsulatedComparable("asus",80000);
        EncapsulatedComparable t3 = new EncapsulatedComparable("vivo",20000);
        EncapsulatedComparable t4 = new EncapsulatedComparable("dell",60000);
        List <EncapsulatedComparable> l = new ArrayList<>();
        l.add(t1);
        l.add(t2);
        l.add(t3);
        l.add(t4);
        Collections.sort(l);
        System.out.println(l);
        for (EncapsulatedComparable encapsulatedComparable : l) {
            System.out.println(encapsulatedComparable);
        }
    }

}