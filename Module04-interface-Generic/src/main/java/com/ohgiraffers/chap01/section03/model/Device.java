package com.ohgiraffers.chap01.section03.model;

public class Device {
    private String name;
    private String model;
    public Device(String model) {
        this.model = model;
    }
    public abstract void powerOn();
    public abstract void powerOff();

    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString(){
        return name + model;
    }

}
