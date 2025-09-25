package com.ohgiraffers.collection.section02;

import java.util.HashMap;
import java.util.Map;

/*
Map 기초
haspMap은 키-값 쌍으로 데이터를 관리하는 컬렉션이다.
각 키는 유이래향 하며, 중복된 키를 사용할 수 없다. 동일한 키에 대해 값을 변경하면 기존 값이 새 값으로 대체된다.'
실생활 비유 : 사전에 단어(키)와 그에 대한 정의(값을)을 저장하는 느낌이다.
데이터의 빠른 검색 및 접근이 가능하며, 키를 통해 직접적으로 갑슬 조회할 수 있다.

hash란?
해시는 데이터를 고정된 크기의 값으로 변환하는 과정을 의미한다. 일반적으로 해시함수를 통해 이루어진다.
해시 함수는 입력값을 받아 해시 코드를 생성하며, 이 해시코드는 hashMap의 내부 내열에서 인덱스로 사용된다.
해시 코드에 따라 데이터가 배열에 분산되어 저장되므로, 특정 키에 대한 값에 빠르게 접근할 수 있다.
해시 충돌이란 서로 다른 입력값이 동일한 해시코드를 생성하는 현상을 말하며 이를 해결하기 위해 다양한 방법이 사용된다.
해시 함수의 품질이 좋을수록 해시 충돌이 적고, hashMap의 성능이 향상된다.

hashMap의 주요 특징
1. 키-값 쌍
hashMap은 데이터를 키와 값으로 구성된 쌍으로 저장하며, 키를 통해 값에 접근할 수 있다.
2. 중복키 허용 불가
동일한 키에 대해 새로운 값을 추가하면 기존 값이 대체된다. 따라서 중복된 키를 사;용할 수 없다.
3. 순서없음
hashMap은 내부적으로 해시 테이블을 사용하므로, 요소으 순서가 유지되지 않는다.
요소의 순서를 보장하려면 linkedHashMap 을 사용할 수 있다.

4.성능
hashMap은 평균적으로 O(1)의 시간 복잡도로 데이터를 검색, 삽입, 삭제할 수 있다.
그러나 해시 충돌이 발생하는 최악의 경우 O(n)의 시간이 소요될 수 있다.

5.메모리 사용
hashMap은 해시 테이블을 사용하므로 메모리 사용량이 상대적으로 크다.
해시 케이블의 크기가 작으면 해시 충돌 발생한 가능성이 높아지므로 적절한 초기 용량과 로드 팩터를 설정하는 것이 좋다.
 */
public class Application {
    public static void main(String[] args){
        Map<Integer,String> bookMap = new HashMap<>();
        bookMap.put(1,"A");
        bookMap.put(2,"B");
        bookMap.put(3,"C");

        System.out.println("HashMap : "+ bookMap);

        //element access
        String book = bookMap.get(2);
        System.out.println(book);

        //element remove
        bookMap.remove(2);
        System.out.println("HashMap : "+ bookMap);

        //element size
        System.out.println("HashMap : " + bookMap.size());

        System.out.println("Book List : ");
        for(Map.Entry<Integer, String> entry : bookMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        if(bookMap.containsKey(3)){
            System.out.println("key 3 has : " + bookMap.get(3));
        }else{
            System.out.println("key 3 has no value");
        }
        if(bookMap.containsValue("cleanCode")){
            System.out.println("Clean code exists");
        }else{
            System.out.println("Clean code does not exist");
        }


    }
}
