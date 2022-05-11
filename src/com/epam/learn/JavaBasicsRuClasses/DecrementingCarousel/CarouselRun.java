package com.epam.learn.JavaBasicsRuClasses.DecrementingCarousel;

public class CarouselRun {
    private final int[] array = DecrementingCarousel.carousel.clone();
    private int position = 0;

    int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        return array[position++]--;
    }

    boolean isFinished() {
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }
}
