package com.ohgiraffers.b_loop.chap01;

public class Application03 {
    /*
    for each 문
    for-each문은 배열이나 컬렉션의 요소를 순회하는데 사용되는 반복문이다.
    타입 : 배열 또는 컬렉션의 요소 타입
    변수명 : 각 요소를 참조할 변수
    배열 또는 컬렉션 순회할 대상
    요소의 개수를 미리 알 수 없거나, 모든 요소를 순회해야 하는 경우 적합하다.
    컬렉션이란? 여러 개의 객체를 저장하고 관리하기 위한 테이블 구조
     */
    public static void main(String[] args) {
        System.out.println("장바구니 목록입니다.");
        String[] basket = {"apple", "monster", "tree", "chocolate"};
        for(String producet : basket) {
            System.out.println(producet);
        }

    }
}
