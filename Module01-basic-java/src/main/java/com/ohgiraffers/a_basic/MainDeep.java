package com.ohgiraffers.a_basic;


/*
* Deep Dive : JVM 메모리 구조
* JVM의 메모리구조는 크게 5개의 영역
* 1.Method Area 메서드 영역
클래스 정보, Static 변수, 상수 풀constant pool 저장
* * 2.Heap
* 객체 및 인스턴수 변수 저장
* 3.Stack
* 지역 변수, 메서드 호출 시 생성되는 프레임 저장
* 4.Pc Register
* 현재 실행 중인 JVM 명령어의 주소 저장
* 5.Native Method Stack
*
* -JNI에서 사용하는 네이티브 코드 실행공간
* -OS 통신 혹은 고성능 연산과 같은 작업을 위해 자바보다 적합한 언어로 개발된 코드가 저장되는 공간이다.
* */


public class MainDeep {
}
