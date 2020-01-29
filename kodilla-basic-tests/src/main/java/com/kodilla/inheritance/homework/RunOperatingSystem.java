package com.kodilla.inheritance.homework;

public class RunOperatingSystem {

    public static void main(String[] args) {

        WindowsVista windowsVista = new WindowsVista(2005, 2010);
        windowsVista.displayPublicationDate();
        windowsVista.turnOn();
        windowsVista.turnOff();

        Windows10 windows10 = new Windows10(2010, 2020);
        windows10.displayPublicationDate();
        windows10.turnOn();
        windows10.turnOff();
    }
}