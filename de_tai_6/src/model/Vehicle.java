package model;

public class Vehicle implements Comparable<Vehicle> {
    private String number;
    private String manufacturer;
    private String year;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String number, String manufacturer, String year, double price) {
        this.number = number;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "model.Vehicle{" +
                "number=" + number +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return Integer.parseInt(this.getNumber()) - Integer.parseInt(vehicle.getNumber());
    }
}
