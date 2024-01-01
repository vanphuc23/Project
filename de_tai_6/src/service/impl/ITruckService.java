package service.impl;

import model.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck();

    List<Truck> findAll();

    List<Truck> searchTruck(String number);

    List<Truck> searchManufacturerOfTruck(String manufacturer);
}
