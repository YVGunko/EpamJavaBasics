package com.epam.learn.JavaBasicsRuClasses.DecrementingCarousel;

public class DecrementingCarousel {
    private final int capacity;
    private int counter;
    static int [] carousel ;
    private boolean isRun;

    {
        counter = 0;
        isRun = false;
    }

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    boolean addElement(int element){
        if (!isRun && counter < capacity && element > 0) {
            carousel[counter] = element;
            counter++;
            return true;
        }
        return false;
        //throw new UnsupportedOperationException();
    }

    CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
        //throw new UnsupportedOperationException();
    }
}
