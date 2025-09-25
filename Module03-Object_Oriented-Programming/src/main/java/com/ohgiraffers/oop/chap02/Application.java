package com.ohgiraffers.oop.chap02;
/*
[캡슐화는 왜 필요할까? ]
객체지향 4대 원칙
캡슐, 추상화, 상속, 다형성

 이전 단계의 의문점 : 외부에서 마음대로 값을 바꿀 수 있는 상태라면, 위험하다.
 객체가 자신의 상태를 스스로 제어하지 못하면, 데이터가 오염되고 시스템 전체의 신뢰도가 무너진다. */

import com.ohgiraffers.oop.chap02.Deep.CapsuleDeep;
import com.ohgiraffers.oop.chap02.noncapsule.Product;

/*
캡슐화의 진정한 의미 : 내 데이터는 내가 책임진다
단순히 데이터를 Private로 감추는 행위가 아니다.
객체가 자신의 상태를 스스로 관리할 '책임'을 갖고, 외부에 대해서 약속된 행위만큼 공개함으로써
객체의 '자율성'을 보장하는 것이 핵심이다.

좋은 객체 설계의 시작
좋이 객체가 어떤 데이터를 가지는가? 가 아닌, 이 객체가 어떤 책임을 수행해야 하는가 를 먼저 질문해야 한다.

접근 제어자
클래스 변수, 메서드의 접근 범 위 설정하는 키워드 이다.
public : 모든 클래스, 접근 가능
protected : 같은 패키지 내의 클래스와 상속받은 클래스에서 접근 가능
private : 같은 클래스 내에서만 접근 가능
default : 아무 접근 제어자도 명시하지 않음 , 같은 패키지 내에서만 접근이 가능.
 */
public class Application {
    public static void main(String[] args){
        Product nonProduct = new Product();
        nonProduct.payment =-1000;
        String result = nonProduct.selling();
        System.out.println(result);

        System.out.println("===캡슐화적용====");

        /*
        com.ohgiraffers.ocp.chap02.capsule.Product product1 = new com.ohgiraffers.ocp.chap02.capsule.Product(100);
        product1.setPayment(100);
        String result1= product1.selling();
        System.out.println(result1);
         */

        com.ohgiraffers.oop.chap02.capsule.Product product2 = new com.ohgiraffers.oop.chap02.capsule.Product(0.0);
        String result2 = product2.selling();
        System.out.println(result2);

        CapsuleDeep capsuleDeep = CapsuleDeep.createCapsule(100.0);
        capsuleDeep.selling();


    }
}
