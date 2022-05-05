package com.epam.learn.JavaBasicsRuClasses.DecrementingCarousel;

public class Main {
    public static void main(String[] args){
        CarouselRun run = new DecrementingCarousel(5).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        DecrementingCarousel carousel = new DecrementingCarousel(5);

        carousel.addElement(1);
        carousel.addElement(2);
        carousel.addElement(3);

        run = carousel.run();
        System.out.println(carousel.addElement(4) + "4");
        System.out.println(carousel.addElement(5));
        System.out.println(carousel.addElement(6));
        System.out.println(carousel.addElement(0));
        System.out.println(carousel.addElement(-123));
        System.out.println(carousel.addElement(-4568));

        if(run != null) {
            System.out.println(run.isFinished()); //false

            System.out.println(run.next()); //2
            System.out.println(run.next()); //3
            System.out.println(run.next()); //1

            System.out.println(run.next()); //1
            System.out.println(run.next()); //2

            System.out.println(run.next()); //1

            System.out.println(run.isFinished()); //true
            System.out.println(run.next()); //-1
        }
    }
}
