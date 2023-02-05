package com.directi.training.srp.solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new CarRepository().getCars();
        CarManager manager=  new CarManager(cars);
        System.out.println(manager.getCarsNames());
    }
}
