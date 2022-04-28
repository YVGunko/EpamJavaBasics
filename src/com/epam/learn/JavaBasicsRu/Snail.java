package com.epam.learn.JavaBasicsRu;
import java.io.IOException;
import java.util.Scanner;
public class Snail {

    static int snail(int start, int end, int a, int b){
        int counter = 0;
        while (start < end) {
            start = start + a - b;
            counter++;
        }
        return counter;
    };
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an a  : ");
        int a = 0;
        if (sc.hasNext()) {
           a = sc.nextInt();
        }
        System.out.print("Enter a b  : ");
        int b = 0;
        if (sc.hasNext()) {
            b = sc.nextInt();
        }
        System.out.print("Enter a h  : ");
        int h = 0 ;
        if (sc.hasNext()) {
            h = sc.nextInt();
        }
        if (b >= a) {
            System.out.println("Impossible");
        }else {
            System.out.println(snail(0, h, a, b));
        }
    }
}
