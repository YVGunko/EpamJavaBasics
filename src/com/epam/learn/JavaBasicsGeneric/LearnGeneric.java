package com.epam.learn.JavaBasicsGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnGeneric {
    public static <T> T getFirst(List<? super T> list) {
        return (T) list.get(0); // compile-time error
    }
    public static <T> void setWild (List<T> list){
        list.set(1, list.get(0));
    }

    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(12);
        setWild(integerList);
        List<? extends Number> numberList = new ArrayList<Integer>();
        Collections.copy((List<Integer>)numberList , integerList);
        System.out.println(getFirst(integerList) + "< - >" + getFirst(integerList).getClass());
        //numberList.add(null);
        //numberList.add(2,1.1);
        for (Object s : integerList){
            if (s != null) {
                System.out.println(s + "< - >" + s.getClass());
            } else {
                System.out.println("null");
            }
        }

        List<? super Integer> superIntegerList = new ArrayList<Number>();
        Collections.copy(superIntegerList, integerList);//RuntimeException IndexOutOfBounds
        System.out.println(superIntegerList.size() + "< - >" +superIntegerList.getClass());
        superIntegerList = integerList;
        System.out.println(superIntegerList.size() + "< - >" +superIntegerList.getClass());
        superIntegerList.add(13);
        superIntegerList.get(0);
        System.out.println(superIntegerList.size() + "< - >" +superIntegerList.getClass());
    for (Object s : superIntegerList){
        System.out.println(s + "< - >" + s.getClass());
    }
    }
}
