package com.OopsConcepts06.Encapsulation01;

public class TestEncapsulation01 {
    public static void main(String[] args) {

        Encapsulation01 obj = new Encapsulation01();
//        modifying the data using setters;
            obj.setStudentName("tarun");
            obj.setStudentRoll(2);
//        accessing the data using getters;
        System.out.println(obj.getStudentName());
        System.out.println(obj.getStudentRoll());

        
    }
}
