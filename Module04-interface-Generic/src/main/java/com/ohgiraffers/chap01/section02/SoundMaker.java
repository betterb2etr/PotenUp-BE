package com.ohgiraffers.chap01.section02;

/**
 * 인터페이스 - 역할을 정의하는 계약
 * 인터페이스란?
 * 객체가 수행해야 할 역할 또는 행위를 정의하는 순수한 계약
 * 무엇을 할 수 있는지를 정의하나, 어떻게 하는지는 정의하지 않는다,
 * 구현체가 책임을 가진다.
 * 코드를 작성하지 않고 메서드만 작성한다.
 * implements 키워드를 통해 클래스틑 여러 개의 인터페이스, 즉 여러 개의 역할을 동시에 수행할 수 있다.
 *
 * 인터페이스 vs 추상 클래스
 * 추상클래스 : is-a 관계, 종족의 개념 Cat is a animal
 * 인터페이스: can-do 관계, 역할 개념 Cat can climb
 *
 * [인터페이스 특징]
 * 메서드는 자동으로 public, abstract로 규정
 * 필드는 자동으로 public static final로 간주되어 상수 취급됨
 * 다중 상속을 지원하며 여러 인터페이스를 구현할 수 있다.
 * 서로 다른 클래스 간의 공통된 기능을 정의하여 코드의 재사용성을 높인다.
 */

public interface SoundMaker {
    int DECIBLE=5;
    public void makeSound(){

    }
}