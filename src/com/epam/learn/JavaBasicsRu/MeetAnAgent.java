package com.epam.learn.JavaBasicsRu;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 911;
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of strangers: ");
        int i = 0;
        if (sc.hasNext()) {
            i = sc.nextInt();
        }
        if (i == 0) System.out.println("Oh, it looks like there is no one here");
        if (i < 0) System.out.println("Seriously? Why so negative?");
        for (int j= 1; j <= i; j++){
            System.out.print("Enter a name of stranger #"+j+" : ");
            if (sc.hasNext()) {
                String name = sc.next();
                System.out.println("Hello, "+name);
            }
        }

    }
}
