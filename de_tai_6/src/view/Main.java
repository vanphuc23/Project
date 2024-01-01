package view;


import controller.VehicleController;

public class Main {
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        vehicleController.list();
    }
}