package com.ohgiraffers.chap01.section02;
/*
**
* 인터페이스로 울음소리 관점 분리
*
* 인터페이스란?
* 특정 관점(기능)을 독립적으로 정의한 규칙
* interface로 선언, 구현은 클래스에서
* 비유 : 울어라 규칙을 따로 만들어 필요한 동물만 가지고 갈 수 있도록 한다.
*
* 인터페이스로 상속 문제 해결]
* Animal은 기본 동물 정의, 울음소리는 SoundMaker로 분리
* 강아지, 고양이는 SoundMaker, 뱀은 안한다
* 결과 : 울음소리 없는 뱀은 불필요한 기능을 받지 않는다.
 */
public class Applicaiton {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Snake()
        };
        for (Animal animal : animals) {
            if(animal instanceof SoundMaker){
                //instanceof을 사용해서 해당되는 아이인지 확인
                ((SoundMaker)animal).makeSound();
            }else{
                System.out.println(animal.getClass()+ "는 울음소리 못내요");
            }

        }
    }
}
