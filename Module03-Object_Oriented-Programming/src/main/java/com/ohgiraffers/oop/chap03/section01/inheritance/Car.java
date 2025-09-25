package com.ohgiraffers.oop.chap03.section01.inheritance;

public class Car {
    public String brand;
    public int speed;
    public String model;

    public void accerlerate(){
        speed +=10;
        System.out.println("brand "+ brand + "speed: " + speed );

    }
}
