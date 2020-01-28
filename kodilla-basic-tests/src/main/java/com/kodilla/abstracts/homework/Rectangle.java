package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(2,2,4);
    }

    @Override
    public int calculateField() {
        return (length * width);
    }

    @Override
    public int calculateCircumference() {
        return (2 * length) + (2 * width);
    }
}