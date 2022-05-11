package com.epam.learn.JavaBasicsRuClasses.TheoryCode;
class A {
    public void job() {
        System.out.println("Method job(). Class A");
    }
}
public class Inheritance extends  A  {
    static private int prop = 1;
    @Override
    public void job() {
        System.out.println("@Overrided method job(). Class Inheritance");
    }
    public void job(int i) {
        System.out.println("Method job(i). Class Inheritance. i="+i);
    }
    public static void main(String [] args) {
        Inheritance b = new Inheritance();
        b.job(0);

        A c = new A();
        c.job();

        A a = new Inheritance();
        a.job();
        ((Inheritance) a).job(1);
    }
}
