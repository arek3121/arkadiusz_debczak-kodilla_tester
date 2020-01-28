package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(5,5,2);
    }

    @Override
    public int calculateField() {
         return (length * length);
    }

    @Override
    public int calculateCircumference() {
        return (4 * length);
    }
}