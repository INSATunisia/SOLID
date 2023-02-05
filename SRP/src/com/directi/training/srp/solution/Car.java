package com.directi.training.srp.solution;

public class Car implements Comparable<Car>
{
    private final String _id;
    private final String _model;
    private final String _brand;

    public Car(String id, String model, String brand)
    {
        _id = id;
        _model = model;
        _brand = brand;
    }

    public String getId()
    {
        return _id;
    }

    public String getModel()
    {
        return _model;
    }

    public String getBrand()
    {
        return _brand;
    }

    public String toString(){
        return this.getBrand() + " " + this.getModel();
    }

    @Override
    public int compareTo(Car car){
        return this.getModel().compareTo(car.getModel());
    }

}
