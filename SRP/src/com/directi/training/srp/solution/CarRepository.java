package com.directi.training.srp.solution;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    private List<Car> _carsDb = Arrays
    .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault"));

    public Car getById(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getCars(){
        return _carsDb;
    }
}
