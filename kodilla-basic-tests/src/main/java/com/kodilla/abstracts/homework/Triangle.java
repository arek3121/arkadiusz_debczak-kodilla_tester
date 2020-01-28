package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    //trójkąt prostokątny

    public Triangle() {
        super(3,4,3);
    }

    int c = (length * length) + (width * width);
    int c1 = (int)Math.sqrt(c);

    @Override
    public int calculateField() {
        return (length * width) / 2;
    }

    @Override
    public int calculateCircumference() {
        return (length + width + c1);
    }
}