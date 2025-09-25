package com.ohgiraffers.exception.section03;

public class Application {
    public static void main(String[] args) {

        try{
            checkAge(10);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){

            throw new InvalidAgeException("나이가18미만이면 가입 불가");
        }
        System.out.println("donedonedonedone");
    }
}
