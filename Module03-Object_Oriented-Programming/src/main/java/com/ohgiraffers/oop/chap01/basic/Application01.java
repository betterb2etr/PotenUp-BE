package com.ohgiraffers.oop.chap01.basic;

public class Application01 {
    public static void main(String[] args) {
        String brand1 = "Tesla";
        String model1 = "Model s";
        int speed1 =0;

        String brand2 = "BMW";
        String model2 = "Model s";
        int speed2 =0;

        System.out.println("Brand: " + brand1 + "Model: " + model1 + "Speed : " + speed1 );
        System.out.println("Brand2: " + brand2 + "Model: " + model2 + "Speed : " + speed2 );


        Car myCar = new Car(); // 변수 선언
        /**
         * 인스턴스 참조
         * my Car는 Car 객체의 주소를 가지고 있으며, . 참조 연ㅅ나자는 이것을 참조한다한다
         * 참조 변수를 통해 객체의 속성을 사용할 수 있다.
         * 참조 변수를 객체의 속성 및 기능을 사용할 수 있다.
         *
         */
        myCar.brand = "Tesla";
        myCar.model = "T2";
        myCar.speed = 0;
    }
    /*
    new 연산자란
    new는 클래스라는 설계도를 바타응로 실제 객체를 메모리에 만들어내는 명령이다.
    new Car(), car설계도를 보고 실제 자동차를 한대 생산해라는 의미다.

     */

}

/**
 * 문제점 : 데이터가 흩어져 있다. 코드상으로 뿔뿔이 흩어져 있는 상태
 * 관리의 어려움 : 자동차가 100개가 되면 100개의 정보 하드코딩
 * 실수 유발 : 숫자 설정에 있어서 실수가 유발될 수 있음
 *
 * //타입, 변수명 : 값;
 *
 */