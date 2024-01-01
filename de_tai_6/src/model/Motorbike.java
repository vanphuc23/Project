package model;


public class Motorbike extends Vehicle {
    private int capacity;

    public Motorbike() {
    }

    public Motorbike(String number, String manufacturer, String year, double price, int capacity) {
        super(number, manufacturer, year, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " model.Motorbike{" +
                "capacity=" + capacity +
                '}';
    }
}
