package com.epam.learn.JavaBasicsRuClasses.TheoryCode;

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
        courses[0].courseName = "MegaCourse";
        for (JavaCourse c : courses) {
            System.out.println(c);
            //c = new JavaCourse();
            c.courseName = "Test";
            System.out.println(c);
        }
        for (JavaCourse c : courses) {
            System.out.println(c.courseName);
        }
    }
}
