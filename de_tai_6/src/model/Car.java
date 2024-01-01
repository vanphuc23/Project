package model;


import java.io.IOException;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String engineType;

    public Car() {
    }

    public Car(String number, String manufacturer, String year, double price, int numberOfSeats, String engineType) {
        super(number, manufacturer, year, price);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return super.toString() + " model.Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
