package com.epam.learn.JavaBasicsRu;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner scanner= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Please enter a time in seconds to display: ");
        try {
            int seconds = scanner.nextInt();
            int sec= seconds % 60;
            int min = (seconds / 60)%60;
            int hou =  (seconds / 3600)%24;
            //
            System.out.printf("%02d:%02d:%02d", hou,min,sec);

        }catch ( NoSuchElementException
                | IllegalStateException
                | IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Is not a number.");
        }
    }
}
