package service;

import exception.VehicleException;
import model.Motorbike;
import service.impl.IMotorbikeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MotorbikeService implements IMotorbikeService {
    private final List<Motorbike> motorbikes = new ArrayList<>();
    private final VehicleException vehicleException = new VehicleException();

    @Override
    public void addMotorbike() {
        String number = checkNumber();
        String manufacturer = vehicleException.inputManufacturer();
        String year = vehicleException.yearValidate();
        double price = vehicleException.priceException();
        int capacity = vehicleException.capacityException();
        Motorbike motorbike = new Motorbike(number, manufacturer, year, price, capacity);
        motorbikes.add(motorbike);
    }

    @Override
    public List<Motorbike> findAll() {
        if (motorbikes.isEmpty()) {
            return new ArrayList<>();
        } else {
            Collections.sort(motorbikes);
            return motorbikes;
        }
    }

    @Override
    public List<Motorbike> searchMotorbike(String number) {
        List<Motorbike> motorbikesSearch = new ArrayList<>();
        for (Motorbike motorbike : motorbikes
        ) {
            if (motorbike.getNumber().contains(number)) {
                motorbikesSearch.add(motorbike);
            }
        }
        return motorbikesSearch;
    }

    @Override
    public List<Motorbike> searchManufacturerOfMotorbike(String manufacturer) {
        List<Motorbike> motorbikesSearch = new ArrayList<>();
        for (Motorbike motorbike : motorbikes
        ) {
            if (motorbike.getManufacturer().contains(manufacturer)) {
                motorbikesSearch.add(motorbike);
            }
        }
        return motorbikesSearch;
    }

    private String checkNumber() {
        while (true) {
            String number = vehicleException.numberException();
            boolean isTrue = true;
            for (Motorbike motorbike : motorbikes) {
                if (motorbike.getNumber().equals(number)) {
                    System.out.println("Số máy của xe máy này đã tồn tại!!!");
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                return number;
            }
        }
    }
}
