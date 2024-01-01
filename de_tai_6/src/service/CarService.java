package service;

import exception.VehicleException;
import model.Car;
import service.impl.ICarService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService implements ICarService {
    private final List<Car> cars = new ArrayList<>();
    private final VehicleException vehicleException = new VehicleException();

    @Override
    public void addCar() {
        String number = checkNumber();
        String manufacturer = vehicleException.inputManufacturer();
        String year = vehicleException.yearValidate();
        double price = vehicleException.priceException();
        int numberOfSeats = vehicleException.numberOfSeatsValidate();
        String engineType = vehicleException.engineTypeInput();
        Car car = new Car(number, manufacturer, year, price, numberOfSeats, engineType);
        cars.add(car);
    }

    @Override
    public List<Car> findAll() {
        if (cars.isEmpty()) {
            return new ArrayList<>();
        } else {
            Collections.sort(cars);
            return cars;
        }
    }

    @Override
    public List<Car> searchCar(String number) {
        List<Car> carSearch = new ArrayList<>();
        for (Car car : cars
        ) {
            if (car.getNumber().contains(number)) {
                carSearch.add(car);
            }
        }
        return carSearch;
    }

    @Override
    public List<Car> searchManufacturerOfCar(String manufacturer) {
        List<Car> carSearch = new ArrayList<>();
        for (Car car : cars
        ) {
            if (car.getManufacturer().contains(manufacturer)) {
                carSearch.add(car);
            }
        }
        return carSearch;
    }

    private String checkNumber() {
        while (true) {
            String number = vehicleException.numberException();
            boolean isTrue = true;
            for (Car car : cars) {
                if (car.getNumber().equals(number)) {
                    System.out.println("Số máy của xe ô tô này đã tồn tại!!!");
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
