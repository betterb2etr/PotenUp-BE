package com.ohgiraffers.a_controlflow.chap02;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        int[][] array = {};
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                array[i][j] =sc.nextInt();


            }
        }
        sc.close();

        int standard=0,tmp =0;
        for(int i=0;i<3;i++){
            standard +=array[0][i];
        }

        for(int i=1;i<3;i++){
            for(int j=0;j<3;j++){
                tmp +=array[i][j];
            }
            if (tmp==standard){  tmp = 0; continue; }
            else break;

        }

    }
}
