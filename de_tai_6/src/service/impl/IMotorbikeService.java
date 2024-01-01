package service.impl;

import model.Motorbike;

import java.util.List;

public interface IMotorbikeService {
    void addMotorbike();

    List<Motorbike> findAll();

    List<Motorbike> searchMotorbike(String number);

    List<Motorbike> searchManufacturerOfMotorbike(String manufacturer);
}
