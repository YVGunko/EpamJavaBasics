package com.epam.learn.JavaBasicsRu;

public class meet {
        public static void main(String[] args) {
            //Write a program, which read a String from System.in and print "Hello, <input string>"
            /*Scanner sc= new Scanner(System.in); //System.in is a standard input stream
            String str= sc.nextLine();
            System.out.print("Hello, "+str);*/
            System.out.println("2 + 2 = " + 2 + 2);
            System.out.println(010 | 4);


            String s = "Hello";
            long l = 99;
            double d = 1.11;
            int i = 1;
            int j = 0;
            System.out.println(j = i << 98);
            j = 0;
            System.out.println(j = i << j);
            j = 0;
            System.out.println(j = i << l);

            long x = 5;
            long y = 2;
            byte b = (byte) (x / y);

            float f = 1 / 2;
            int ii = 1 / 3;
            double dd = 555d;

            int iii = 3;
            byte bbb = 1;
            byte b1 = 1 + 2;                // line 1
            System.out.println("b1="+b1);
            short s1 = (short) 304111;       // line 3
            //bbb = b1 + 1;                     // line 4
            bbb = (byte)  (b1 + 1);           // line 5
            //bbb = -bbb;                         // line 6
            bbb = (byte) -bbb;                  // line 7
            b1 *= 2;                       // line 8

            bbb = (byte)  i;
            bbb = 100;
            float fff = 1.1f;
            //bbb /= fff;
            //bbb = bbb / fff;
            System.out.println(bbb /= fff);
            System.out.println(bbb / fff);

    }
}
