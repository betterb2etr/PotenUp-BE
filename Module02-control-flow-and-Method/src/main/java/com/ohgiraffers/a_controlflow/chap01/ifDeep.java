package com.ohgiraffers.a_controlflow.chap01;

/**
 * if문의 깊은 개념
 * if 문은 jvm스택에서 조건식을 계싼하고, 그 결과를 스태겡 저장된다.
 * 조건식이 참이면 해당 코드 블록으로 jump, 거짓이면 다음 분기로 이동
 * 복잡한 조건식은 단락평가 short circuit evaluation을 통해 최적화된다.
 *
 * Short Circuit Evaluation 단축평가
 * and 연산 or || 연산,
 *
 * 메모리 관점
 * 조건식의 변수는 스택에 저장되며, 블록 내 지역 변수도 스택 프레임에 추가.
 * 너무 ㅁ낳은 중첩 if는 스택 사용량을 늘리고 가독성을 떨어뜨린다.
 * jdk 17개선 패턴 매칭으로 if 문대신 instanceof와 함꼐 사용 가능
 */


public class ifDeep {
}
