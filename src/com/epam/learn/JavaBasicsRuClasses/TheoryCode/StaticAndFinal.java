package com.epam.learn.JavaBasicsRuClasses.TheoryCode;

import static com.epam.learn.JavaBasicsRuClasses.TheoryCode.Emp.MAX_AGE;
import static com.epam.learn.JavaBasicsRuClasses.TheoryCode.Emp.MIN_AGE;

class Emp {
    final static public int MIN_AGE = 20;
    static final int MAX_AGE = 70;
    final static  int AVR_AGE = 70;
}
class JavaCourse {
    String courseName = "Java";
}

public class StaticAndFinal {
    public static void main(String[] args) {
        JavaCourse courses[] = { new JavaCourse(), new JavaCourse() };
        System.out.println(MIN_AGE);
        System.out.println(MAX_AGE);
        System.out.println("------");

        for (JavaCourse c : courses) {
            System.out.println(c.courseName);
        }
        courses[0].courseName = "MegaCourse";
        System.out.println(courses[0].courseName);
        for (JavaCourse c : courses) {
            System.out.println(c);
            System.out.println(c.courseName);
            System.out.println("------");
            c.courseName = "Test";
            System.out.println(c);
            System.out.println(c.courseName);
            System.out.println("------");
        }
        for (JavaCourse c : courses) {
            System.out.println(c.courseName);
        }
    }
}
