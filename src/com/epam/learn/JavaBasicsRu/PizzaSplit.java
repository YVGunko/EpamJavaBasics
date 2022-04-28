package com.epam.learn.JavaBasicsRu;
import java.util.Scanner;
public class PizzaSplit {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int i = 1;
        if (sc.hasNextLine()) {
            String[] string = sc.nextLine().split(" ");
            if (string.length == 2){
                int humans = Integer.valueOf(string[0]);
                int pieces = Integer.valueOf(string[1]);
                do {
                    result = pieces*i++;
                    result %=humans;
                }
                while (result != 0);
            }

        }

        // Get a result of your code

        System.out.println(i-1);
    }

}
