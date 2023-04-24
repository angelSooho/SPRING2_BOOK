package com.mysite.sbb.Something.SingleTon;

public class Car {

    private static Car car = new Car();

    private Car() {}

    public static Car getInstance() {
        return car;
    }
}
