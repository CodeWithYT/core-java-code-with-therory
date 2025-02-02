package com.java8features.perdeffuninterf;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class $Function {
    public static void main(String[] args) {
    Student [] s = {
            new Student("nitish",95),
            new Student("ravi", 86),
            new Student("sam", 82),
            new Student("rohan", 96),
            new Student("viraj", 74),
            new Student("sukesh", 66),
            new Student("venkat", 51),
            new Student("vineeth", 39)
    };
        Function<Student, Character> f = (i)->{
            if (i.marks > 90) {
                return 'A';
            } else if (i.marks>80) {
                return 'B';
            } else if (i.marks>70) {
                return 'c';
            } else if (i.marks>60) {
                return 'D';
            } else if (i.marks>50) {
                return 'E';
            }else {
                return 'F';
            }
        };
        Predicate<Student> p = (q)-> q.marks > 70;
        for (Student student: s){
            if(p.test(student)) {
                System.out.println("Name: " + student.name);
                System.out.println("Grade: " + f.apply(student));
                System.out.println("--------------------");
            }
        }

    }
}
