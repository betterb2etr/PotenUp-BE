package com.ohgiraffers.oop.chap04.section01;

public class Animal {
    public String name;
    public Animal(String name){
        this.name=name;
    }
    /*

     */
    //abstract : 몸체를 갖지 않는다, 추상메서드

    /**
     * abstract keyword
     * 클래스나 메서드를 "추상적으로"만듦
     * 객체를 직접 생성할 수 없으며, 자식 클래스에서 상속해야함
     * 이를 상속받는 클래스에서는 바드시 불완전한 요소를 해겨랳야 한다.
     * 이러한 것을 구현 책임으 ㅣ원칙이라 한다.
     * abstract 메서드 몸체가 없으며, 자식 클래스에서 반드시 구현해야 한ㄷ.ㅏ
     */
    public abstract void makeSound();

}
