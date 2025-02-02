package com.OopsConcepts06.Encapsulation01;
/*
    encapsulation:
        - Encapsulation means binding or wrapping Or bundling the data with "related functionality" into a single unit and the single unit can be class or package;
    example:
        - in java we have packages like lang, util, sql, math extra rather than creating different packages we can create one class and keep all the functionalities in a single class, but it creates an ambiguity that there will some functionalities which we want to make them accessible for the certain class only so for that security and modularity requirement to not make our data to be accessible for free to everyone we bundle our data into a single entity like classes and packages;
    real-world example:
        - in simple understanding let us take an example of a paracetamol and saridon capsule the paracetamol capsule is formulated with the medicinal properties to counter fever, and where comes to saridon it is formulated with medicinal properties to counter headache so in this scenario let us assume the medicinal properties as our variables and methods which are bundled inside a capsule and the capsule we can call as class so, to wrap all the related functionalities of an object we follow encapsulation mechanism;

    encapsulation: data hiding + abstraction;
        data hiding:
            - data hiding is the process of restricting the access of our data members by other classes;
            - to stop the access from one class to another;
            - to give the access to read the data from one class to another class;
            - to give the permission to modify the data from one class to another class;

    the encapsulation mechanism is widely used to create Plain Old Java Object (POJO);
    POJO:
        - A POJO is primarily used for defining object entities and encapsulating data.
        - the class do not contain any main method but, because it’s not meant to be an entry point for executing a standalone program.
        - POJOs enhance code readability, reusability, and maintainability.
        - They are widely used for defining object entities in various applications.
 */
public class Encapsulation01 {

//  here the instance variables are of type private, so they cannot be accessible to the other classes;
    private String studentName;
    private int studentRoll;

//  so here to no give direct access to our variables to be modified and accessed we use getters and setters to access and to modify our variables
    String getStudentName(){
        return studentName;
    }
    void setStudentName(String studentName){
        this.studentName = studentName;
    }

    int getStudentRoll(){
        return studentRoll;
    }
    void setStudentRoll(int studentRoll){
        this.studentRoll = studentRoll;
    }

}
