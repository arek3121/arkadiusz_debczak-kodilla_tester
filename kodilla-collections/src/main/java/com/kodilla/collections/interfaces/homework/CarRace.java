package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Ford ford = new Ford(80);
        doRace(ford);

        Opel opel = new Opel(100);
        doRace(opel);

        Bmw bmw = new Bmw(150);
        doRace(bmw);
    }

    public static void doRace(Car car){
        increaseSpeed(car);
        decreaseSpeed(car);
        System.out.println(car.getSpeed());
    }

    public static void decreaseSpeed(Car car) {
        car.decreaseSpeed();
        car.decreaseSpeed();
    }

    public static void increaseSpeed(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
    }
}