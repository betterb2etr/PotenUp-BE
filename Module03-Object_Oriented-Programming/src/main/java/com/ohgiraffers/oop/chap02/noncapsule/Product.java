package com.ohgiraffers.oop.chap02.noncapsule;

public class Product {
    public double payment;
    public String selling(){
        if(payment == 0){
            return "냅둬, 그냥 개나 주게";
        }else if (payment <0){
            return "장사는 뭐더려혀 어차피 남주는데 ";
        }else{
            return payment + "에 가지고 가려면 그러던가";
        }
    }
}
