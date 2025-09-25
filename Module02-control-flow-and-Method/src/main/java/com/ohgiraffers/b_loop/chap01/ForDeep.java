package com.ohgiraffers.b_loop.chap01;

/**
 * for 문 동작의 메모리 구조
 * 포문이 시작될 떄, 반복제어 변수은 스택에 생성된다
 * 조건문이 참이면 본문을 실행하고 증감시긍ㄹ 통해 변수값을 변경한 뒤 다시 조건을 검사하는
 * 과정 반복
 * 반복횟수가 끝나ㄴ면 포문의 스택 프레임은 제거되고, 다음 코드로 넘어간다.
 *
 * [성능 최적화 관점 ]
 *  포문은 초기식에서 변수를 한번만 선언, 계산하는 것이 좋다.
 *  ex
 *  len = arr.length;
 *  for(int i=0;i<len.length;i++) {... }
 * JIT just in time 컴파일러가 반복 패턴을 최적화한다.
 *
 * for each
 * for each 사용하면 요소를 순회하는 과정에서 내부적으로 최적화된 방버을 사용한다.
 * 또한 조건식 기술 등의 코드가 감소하면서 성능이 높아지게된다
 * 그러나 큰 차이는 없다
 *
 *
 */
public class ForDeep {
    public static void main(String[] args) {


    }
}
