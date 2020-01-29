package com.kodilla.inheritance.homework;

public class Windows10 extends WindowsVista {

    Windows10(int publicationDateOn, int publicationDateOff) {
        super(publicationDateOn, publicationDateOff);
    }

    @Override
    void turnOn() {
        System.out.println("System Windows 10 is turned on");
    }
    @Override
    void turnOff() {
        System.out.println("System Windows 10 is turned off");
    }
}