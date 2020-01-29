package com.kodilla.inheritance.homework;

public class WindowsVista extends OperatingSystem {

    WindowsVista(int publicationDateOn, int publicationDateOff) {
        super(publicationDateOn, publicationDateOff);
    }

    void turnOn() {
        System.out.println("System Windows Vista is turned on");
    }

    void turnOff() {
        System.out.println("System Windows Vista is turned off");
    }
}