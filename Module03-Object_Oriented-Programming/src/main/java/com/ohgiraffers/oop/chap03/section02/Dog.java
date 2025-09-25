package com.ohgiraffers.oop.chap03.section02;

public class Dog extends Animal {
    public Dog(String name) {
         super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.name + "makes sound ");
    }
}
