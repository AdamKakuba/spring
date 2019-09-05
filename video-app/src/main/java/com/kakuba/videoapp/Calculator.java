package com.kakuba.videoapp;

public class Calculator {

    public int add(int a,int b){
        return a + b;
    }

    public double divide(double a,double b){
        if(b == 0){
            throw new ArithmeticException("number can not divide by 0");
        }
        return a / b;
    }
}
