package com.ohgiraffers.oop.chap01.basic2;
/*
Constructor 생성자
객체를 만들 떄 처음 실행되는 특수한 메서드
클래스 이름과 같고, 반환 타입이 없다
객체와 초기 상태를 설정
자동차 공장에서 차를 만들 떄 처음 브랜드와 모델을 붙이는 과정

실생활 예제
영화티켓을 예매할 때, 영화제목, 좌석 번호를 초기화해야하 한다

 */


public class Application {
    public static void main(String[] args){
        TicketWithoutConstructor ticket = new TicketWithoutConstructor();
        ticket.printTicket();

        System.out.println();
        MovieTicket movieTicket = new MovieTicket("Avengers", "A10");
        movieTicket.printTicket();

    }
}
//필드가 초기화 되어 있어야 함.