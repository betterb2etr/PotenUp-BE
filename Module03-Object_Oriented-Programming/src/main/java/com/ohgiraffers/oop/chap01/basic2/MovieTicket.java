package com.ohgiraffers.oop.chap01.basic2;

public class MovieTicket {
    String movieName;
    String seatNumber;

    //불변성 확보 형태
    public MovieTicket(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;


    }
    public void printTicket(){
        System.out.println(movieName);
        System.out.println(seatNumber);
    }
}
