package model;


public class Truck extends Vehicle {
    private double weight;

    public Truck() {
    }

    public Truck(String number, String manufacturer, String year, double price, double weight) {
        super(number, manufacturer, year, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " model.Truck{" +
                "weight=" + weight +
                '}';
    }
}
