package com.epam.learn.JavaBasicsRuClasses.TheoryCode;

class Person {
    String version = "Person";
    public void print() {
        System.out.println("Person");
    }
    String testMethod() {
        return "Person";
    }
}
class Student extends Person {
    String version = "Student";
    public void print() {
        System.out.println("Student");
    }
    String testMethod() {
        return "Student";
    }
}
public class Boy {
    public static void main(String[] args) {
        Person person = new Student ();
        person.print();
        System.out.println(person.version + person.testMethod());
    }
}