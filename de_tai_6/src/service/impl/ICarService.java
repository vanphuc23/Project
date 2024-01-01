package service.impl;

import model.Car;

import java.util.List;

public interface ICarService {
    void addCar();

    List<Car> findAll();

    List<Car> searchCar(String number);

    List<Car> searchManufacturerOfCar(String manufacturer);
}
