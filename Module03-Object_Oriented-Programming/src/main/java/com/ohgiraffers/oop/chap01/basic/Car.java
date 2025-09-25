package com.ohgiraffers.oop.chap01.basic;
/*
클래스란?
객체를 생성하기 위한 설계도
변수_필드와 메서드_기능 을 포함한다.

객체란?
단순한 데이터 덩어리가 아닌 스스로 상태를 책임지는 행위의 주체
객체는 현실 세계의 사물을 모방하는 것이 아니라, 특정 책ㅇ미을 수행하는 역할을 부여받은 존재이다.

좋은 객체의 설계의 시작
이 객체가 어떤 데이터를 가지는가? 가 아닌 이 객체가 어떤 책임을 수행해야 하는가를 먼저 질문해야한다.
이 객체가 어떤 책임을 수행해야 하는가!!
CAR 객체의 책임은 이동하는 것, 따라서 외부에서 속도를 직접 제어하는 것이 아니라,
가속해라, 감속해라, 라는 메세지를 보내 책임을 수행할 수 있도록 요청해야 한다.

문법 구조
class 클래스 이름 {
 //필드 : 속성,
   메서드 : 기능

}
 */

public class Car {

    public String brand;
    public String model;
    public int speed;
    private boolean status;

    //접근 제어자 / 클래스명()
    //  자동차를 쓸려고 만들었는데, 어떻게 만드는지 안알려줌 -> 기본생성자 필요

    public Car() {
        this.model = model;
        this.speed = speed;

    }

    public void acclerate() {
        speed+=10;
        System.out.println("brand: " + "Model: " + model +  "speed" + speed);
    }
    public void brake() {
        speed-=10;
        System.out.println("brand: " + "Model: " + model +  "speed" + speed);
    }

}
