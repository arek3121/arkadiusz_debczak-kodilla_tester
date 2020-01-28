package com.kodilla.abstracts.homework;

public abstract class Shape {

    int length;
    int width;
    int height;

    public Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public abstract int calculateField();

    public abstract int calculateCircumference();
}