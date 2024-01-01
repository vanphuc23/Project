package service;

import exception.VehicleException;
import model.Truck;
import service.impl.ITruckService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TruckService implements ITruckService {
    private final List<Truck> trucks = new ArrayList<>();
    private final VehicleException vehicleException = new VehicleException();

    @Override
    public void addTruck() {
        String number = checkNumber();
        String manufacturer = vehicleException.inputManufacturer();
        String year = vehicleException.yearValidate();
        double price = vehicleException.priceException();
        double weight = vehicleException.weightException();
        Truck truck = new Truck(number, manufacturer, year, price, weight);
        trucks.add(truck);
    }

    @Override
    public List<Truck> findAll() {
        if (trucks.isEmpty()) {
            return new ArrayList<>();
        } else {
            Collections.sort(trucks);
            return trucks;
        }
    }

    @Override
    public List<Truck> searchTruck(String number) {
        List<Truck> trucksSearch = new ArrayList<>();
        for (Truck truck : trucks
        ) {
            if (truck.getNumber().contains(number)) {
                trucksSearch.add(truck);
            }
        }
        return trucksSearch;
    }

    @Override
    public List<Truck> searchManufacturerOfTruck(String manufacturer) {
        List<Truck> trucksSearch = new ArrayList<>();
        for (Truck truck : trucks
        ) {
            if (truck.getManufacturer().contains(manufacturer)) {
                trucksSearch.add(truck);
            }
        }
        return trucksSearch;
    }


    private String checkNumber() {
        while (true) {
            String number = vehicleException.numberException();
            boolean isTrue = true;
            for (Truck truck : trucks) {
                if (truck.getNumber().equals(number)) {
                    System.out.println("Số máy của xe tải này đã tồn tại!!!");
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
