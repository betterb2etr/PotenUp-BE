package com.ohgiraffers.d_activity.mission;

/*
 * 메서드의 종류
 * 1. 정적 메서드 (static method):
 *   클래스에 속하며, 객체 생성 없이 호출할 수 있다.
 *   예 :  Math.max(a,b)
 *
 * 2. 인스턴스 메서드 (instance Method) :
 *   객체에 속하며, 객체를 생성한 후에 호출해야한다.
 *   예 : String str = "hello"; str.length();
 *
 * 3. 생성자(constructor):
 *   클래스의 인스턴스를 생성할 때 호출되는 특별한 메서드이다.
 *   생성자 반환 타입이 없고, 클래스 이름과 동일하다.
 *
 * 4. 오버로딩 (Meethod Overloading)
 *   같은 이름의 메서드를 여러 개 정의하되, 매개변수의 타입이나 개수(시그니처)를 다르게 하여 사용한다.
 *   예 :
 *   public int add(int a, int b) {...}
 *   public double add(double a, double b) {...}
 * 메서드 오버로딩을 통해 같은 기능을 수행하는 다양한 메서드를 제공할 수 있다.
 * */
//Advanced
public class mission {
    public static void main (String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++) System.out.print(" ");
            for(int j=0;j<2*i+1;j++) System.out.print("*");
            for(int j=0;j<4-i;j++) System.out.print(" ");
            System.out.println();

        }

    }
}
