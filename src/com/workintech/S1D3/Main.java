package com.workintech.S1D3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person sertac = new Person("Sertaç", "YILDIRIR", 27);
        Person faruk = new Person("Faruk", "YILDIRIR", 55, 13000, true, new String[]{"film", "music"});
        System.out.println("First Name: " + sertac.firstName);
        System.out.println("Last Name: " + sertac.lastName);
        System.out.println("Age: " + sertac.age);
        System.out.println("First Name: " + faruk.firstName);
        System.out.println("Last Name: " + faruk.lastName);
        System.out.println("Age: " + faruk.age);
        System.out.println("Salary: " + faruk.salary);
        if (faruk.isMarried) {
            System.out.println("Marital Status: Married");
        } else {
            System.out.println("Marital Status: Single");
        }
        System.out.println("Hobbies: " + Arrays.toString(faruk.hobbies));
        System.out.println("***********************");
        System.out.println(sertac.getFirstName());
        System.out.println(sertac.isTeen());
        System.out.println(faruk.getFirstName());
        System.out.println(faruk.getLastName());
        System.out.println("***********************");
        Wall wall1 = new Wall(5,4);
        Wall wall2 = new Wall(7, 3);
        System.out.println(wall1.area());
        System.out.println(wall2.area());
        System.out.println(wall2.getHeight());
        wall2.setHeight(5);
        System.out.println(wall2.area());
        System.out.println(wall2.getHeight());

        System.out.println();
    }
}