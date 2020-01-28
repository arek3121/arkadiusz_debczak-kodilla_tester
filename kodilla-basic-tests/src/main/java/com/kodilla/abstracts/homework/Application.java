package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square();
        System.out.println("Square circumference: " + square.calculateCircumference());
        System.out.println("Square field: " + square.calculateField());

        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle circumference: " + rectangle.calculateCircumference());
        System.out.println("Rectangle field: " + rectangle.calculateField());

        Triangle triangle = new Triangle();
        System.out.println("Triangle circumference: " + triangle.calculateCircumference());
        System.out.println("Triangle field: " + triangle.calculateField());
    }
}