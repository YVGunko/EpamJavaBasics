package com.epam.learn.JavaBasicsCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesAnki {
    private static ArrayList propIterat (Properties p){
        Set set = p.keySet();
        ArrayList arrayList = new ArrayList<>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
               arrayList.add("Key "+ p.getOrDefault((String) iterator.next(), "No value"));
        }
        return arrayList;
    }
    public static void main(String[] args) {
        String greek [] = {"Alfa","Beta"};
        try {
            System.out.println(greek[2]);
        }catch (RuntimeException r){
            System.out.println(r);
        }
        Properties p = new Properties();
        p.setProperty("1", "#1");
        p.put(2, 2);
        p.put("3", "#3");
        p.propertyNames().asIterator();
        System.out.println(propIterat(p));

    String textVal = "12a";
    int val;

    try {
        val = Integer.parseInt(textVal);
    }catch (NumberFormatException r){
        System.out.println(r);
    }catch (ArithmeticException r){
        System.out.println(r);
    }
    }
}
