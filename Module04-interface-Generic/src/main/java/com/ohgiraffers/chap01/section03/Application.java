package com.ohgiraffers.chap01.section03;

import com.ohgiraffers.chap01.section03.model.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("기기특징과 충전 관점");
        Device smartphone = new Smartphone("Galaxy");
        Device laptop = new Laptop("Laptop");
        Device tv = new Tv("OLED");

        smartphone.powerOn();
        laptop.powerOn();
        tv.powerOn();


        ((Rechargeable) smartphone).recharge();
        ((Rechargeable) laptop).recharge();

        Device[] devices = {smartphone, laptop, tv};
        for(Device device:devices){
            device.powerOn();
            if(device instanceof Rechargeable){
                ((Rechargeable) device).recharge();
            }else{ }
            device.powerOff();
        }
    }
}
/**
 * 인터페이스 Deep Dive - 상속 계층도와 설계 간편화
 * 전자기기는 다양한 특성과 기능을 가지는데, 상속만으로 모든 기능을 정의하면 불필요한 기능까지 물려받거나 유연성이 떨어진다.
 *
 * 모든 기기에 충전을 상속한다면 TV도 충전해야 하는 비현실적 상황 발생
 * 인터페이스로 특정 기능을 분리하면 필요한 기기만 선택적으로 가져갈 수 있어 설계까 깔끔해진다.
 *
 * [설계과정]
 *1  Device 로 기본 계측 구축
 * 모든 전자기기는 전원을 켜고 끄는 기본동작을 필요
 * -> device를 추상 클래스로 정의해 공통 동작 보장
 * 역할: 전자기기라는 큰 범주 설정, 하위 계층으로 특성을 나눌 준비
 * 비유 전자기기 공장에서 기본 모델 설계도를 만드는 단계
 *
 *2 PortableDevice, Fixed Device 로 특성분리
 * 휴대기기 Portable은 이동 가능, 고정 기기는 고정 설치 -> 계층도를 나누어 특성을 구체화
 * 역할: 상속으로 각 기기의 기본 동작(전원 방식)을 다르게 정의해 계층적 관리 가능
 * 비유 : 공장에서 휴대용과 고정형 라인으로 생성 분리
 *
 * 3 Rechargeable 인터페이스로 충전 관점 분리
 * 모든 휴대기기가 충전 가능한 것은 아님
 * smartphone, laptop은 충전 필요, TV는 불필요-> rechargeable 인터페이스로 분리해 선택적 적용
 * 역할: 상속 계층 밖에서 충전 기능을 정의해 필요한 기기만 가져가도록 유연성 확보
 * 비유: 공장에서 충전 옵션을 별도 부품으로 만들어 필요한 모델에만 장착
 *
 * 설계의 장점
 * 계층도(Device -> Portable/Fixed) 전원 동작 기기 유형을 체계적으로 정리
 * 인터페이스 (Rechargeable) : 충전이라는 관점을 독립적으로 정의해 불필요한 결합 방지
 * 결과 : Smartphone, laptop 충전가능 TV 충전없이 고정기기로 유지 -> 설계 간결, 확장 쉬움
 *
 * [실무연계]
 * 상속 계층으로 기본 구조를 잡고, 인터페이스로 특정 기능을 모듈화 하면 기기 추가 기능 확장 용이,
 * 스마트폰에만 무선 충전 추가시 확장 가능 
 public class Application {
}
