package com.ohgiraffers.collection.section03;

import java.util.HashSet;
import java.util.Set;

/***
 * set 기초
 * set은 중복되지 않은 요소의 집합을 관리하는 컬렉션이다.
 * 각요소는 유일해야 하며 순서가 보장되지 않는다.
 * 중복된 데이터를 허용하지 않으므로, 고유한 값만 관리할 수 있다.
 *
 * set의 구현 클래스
 * hashSet :
 * 해시 케이블을 기반으로 하며, 중복된 요소를 허용하지 않는다.
 * 요소의 순서가 유지되지 않으며, 빠른 검색과 삽입 성능을 제공한다.
 * hashSet의 경우 입력 데이터를 기준으로 hash을 생성하고 생성된 해시를 key 로 사용하는 방식이다.
 *
 * 2. LinkedHashSet
 * hashSet의 순서를 유지하는 버전으로, 입력 순서가 보장된다.
 * 입력값이 들어오면 이를 기준으로 hash값을 저장하며 입력값을 빠르게 탐색한다.
 * 해시 테이블과 함께 이중 연결 리스트를 가지고 있으며 이를 통해 다음번 연결번의 순서를 알 수 있게된다.
 * 즉, 해시 테이블과 이중 연결리스트를 함꼐 하용하는 방식이다.
 *
 * 3.treeSet
 * 요소를 정렬된 순서로 저장하며, 이진 탐색 트리를 사용한다.
 * 입력되는 요소는 자동으로 정렬되며, 중복된 요소는 허용되지 않는다.
 * 이진 탐색 트리를 기반으로 하므로, 요소의 검색, 추가, 삭제가 평균적으로 0(logn))의 시간복잡도로 수행된다.
 * 정렬된 데이터를 필요로 할 떄 유용하며, 범위 검색과 같은 직업을 쉽게 수행할 수 있다.
 * 예를 들어, 특정 범위 내의 요소를 찾거나, 정렬된 순서로 요소를 출력해야 할 때 유리하다.
 *
 * [set의 주요 특징]
 * 1. 중복 허용 불가.
 * set은 동일한 값을 추가할 수 없으며, 중복된 요소는 무시된다.
 * 2. 순서 없음
 * hashSet은 요소의 순서를 보장하지 않으며, 요소의 순서는 예측할 수 없다.
 * 3.성능
 * hashSet은 평균적으로 O(1)의 시간 복잡도로 데이터를 검색, 삽입, 삭제할 수 이싿.
 * 4. 메모리 사용
 * hashSet은 내부적으로 해시 테이블을 사용하기 떄문에 메모리 사용량이 상대적으로 크다.
 *///
public class Application {
    public static void main(String[] args) {
        Set<String> bookSet = new HashSet<>();
        bookSet.add("A");
        bookSet.add("B");
        bookSet.add("C");
        bookSet.add("D");

        System.out.println("hashSet : " + bookSet);

        //element delete
        bookSet.remove("D");
        System.out.println("hashSet : " + bookSet);

        //verify size of set
        System.out.println("hashset : " + bookSet.size());

        System.out.println("list of books ");
        for(String book : bookSet ){
            System.out.println(book);
        }
        //verify existence of set value
        if(bookSet.contains("A")){
            System.out.println("A exists");
        }else{
            System.out.println("A not exists");
        }
    }

}
