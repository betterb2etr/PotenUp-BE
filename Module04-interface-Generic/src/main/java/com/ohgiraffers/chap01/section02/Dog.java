package com.ohgiraffers.chap01.section02;

public class Dog extends Animal implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("I'm a dog!" + SoundMaker.DECIBLE);
    }
}
