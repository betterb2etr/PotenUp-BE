package com.ohgiraffers.oop.chap03.section02;

public class Animal (){
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Making Sound");

    }

    @Override
    public String toString() {
        return "Animal" + "name = " + name + "\'/" + "}";
    }
}
