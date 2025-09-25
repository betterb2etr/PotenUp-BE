package com.ohgiraffers.chap01.section03.model;
// abstract 부모에게서 받은것을 여기에서도 구현할 것은 아니야,
public class FixedDevice extends Device{
    public FixedDevice(String model){
        super(model);
    }
    @Override
    public void powerOn() {
    System.out.println("fixed" + super.getModel());
    }
    @Override
    public void powerOff() {
        System.out.println("fixed" + super.getModel());
    }
}
