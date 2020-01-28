package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displaySalaryAndResponsibilities() {
        System.out.println(job.getResponsibilities());
    }

    public static void main(String[] args){
        Job teacher = new Teacher();

        Person teacher1 = new Person("Daniel", 25, teacher);
        teacher1.displaySalaryAndResponsibilities();

        Job baker = new Baker();

        Person baker1 = new Person("Krzysiek", 25, baker);
        baker1.displaySalaryAndResponsibilities();
    }
}