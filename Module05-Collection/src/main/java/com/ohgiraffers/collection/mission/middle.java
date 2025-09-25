package com.ohgiraffers.collection.mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class middle {
    public static void main(String[] args) {
        // 1. 1~45 사이의 중복되지 않는 번호를 저장할 HashSet 생성
        Set<Integer> lotto = new HashSet<>();

        // 2. HashSet의 크기가 6이 될 때까지 번호 생성 반복
        while (lotto.size() < 6) {
            // 3. 1~45 범위의 난수 생성
            int tmp = (int) (Math.random() * 45) + 1;

            // 4. 생성된 번호를 HashSet에 추가 (중복된 값은 자동으로 무시됨)
            lotto.add(tmp);
        }

        // 5. 정렬을 위해 HashSet을 ArrayList로 변환
        ArrayList<Integer> result = new ArrayList<>(lotto);

        // 6. Collections.sort()를 이용해 ArrayList를 오름차순으로 정렬
        Collections.sort(result);

        // 7. 최종 결과 출력
        System.out.println("생성된 로또 번호 : " + result);
    }
}