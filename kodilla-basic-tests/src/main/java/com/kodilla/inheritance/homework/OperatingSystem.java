package com.kodilla.inheritance.homework;

public class OperatingSystem {

    void turnOn() {
        System.out.println("System was turned on: ");
    }

    void turnOff() {
        System.out.println("System was turned off: ");
    }

    int publicationDateOn;
    int publicationDateOff;

    OperatingSystem(int publicationDateOn, int publicationDateOff) {
        this.publicationDateOn = publicationDateOn;
        this.publicationDateOff = publicationDateOff;
    }

    public int getPublicationDateOn() {
        return publicationDateOn;
    }

    public int getPublicationDateOff() {
        return publicationDateOff;
    }

    public void displayPublicationDate(){
        System.out.println("Published from: " + publicationDateOn);
        System.out.println("Not supported from: " + publicationDateOff);
    }
}