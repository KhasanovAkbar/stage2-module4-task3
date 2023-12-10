package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;

public class RectangleObserver implements Observer {
    //
    @Override
    public void handleEvent(RectangleEvent event) {
        //
        Rectangle rectangle = event.getSource();
        double perimeter = 2 * (rectangle.getSideA() + rectangle.getSideB());
        double square = rectangle.getSideA() * rectangle.getSideB();
        new RectangleValues(perimeter, square);
        System.out.print("Perimeter: " + perimeter);
        System.out.print("Square: " + square);
    }
}
