package com.workintech.S1D3;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,
                  double salary, boolean isMarried, String[] hobbies) {
        this (firstName, lastName, age);
        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isTeen() {
        return age <= 19 && age >= 13;
    }
}
