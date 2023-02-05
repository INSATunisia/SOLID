package com.directi.training.srp.solution;

import java.util.List;

public class CarManager
{   
    List<Car> cars;
    public CarManager(List<Car> cars){
        this.cars = cars;
    }
    public String getCarsNames()
    {
        return ListFormatter.formatList(this.cars);
    }

    public Car getBestCar()
    {
        return ListComparer.getBest(this.cars);
    }
}
