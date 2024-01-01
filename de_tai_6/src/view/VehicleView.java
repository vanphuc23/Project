package view;

import exception.VehicleException;
import model.Car;
import model.Motorbike;
import model.Truck;

import java.util.List;

public class VehicleView {
    private final VehicleException vehicleException = new VehicleException();

    public int display() {
        int choose;
        System.out.println("-- Danh sách chức năng --");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tìm kiếm");
        System.out.println("4. Exit");
        choose = vehicleException.chooseType();
        return choose;
    }

    public int showListOfVehicle() {
        int choose;
        System.out.println("-- Chọn danh sách phương tiện bạn muốn xem --");
        System.out.println("1. Ô tô");
        System.out.println("2. Xe máy");
        System.out.println("3. Xe tải");
        System.out.println("4. Hủy và quay lại danh sách");
        choose = vehicleException.chooseType();
        return choose;
    }

    public int showAdd() {
        int choose;
        System.out.println("-- Chọn loại phương tiện bạn muốn thêm vào --");
        System.out.println("1. Ô tô");
        System.out.println("2. Xe máy");
        System.out.println("3. Xe tải");
        System.out.println("4. Hủy và quay lại danh sách");
        choose = vehicleException.chooseType();
        return choose;
    }

    public int showSearch() {
        int choose;
        System.out.println("-- Bạn muốn tìm kiếm theo gì? --");
        System.out.println("1. Số máy");
        System.out.println("2. Hãng sản xuất");
        System.out.println("3. Hủy và quay lại danh sách");
        choose = vehicleException.chooseType();
        return choose;
    }

    public void showListCar(List<Car> cars) {
        System.out.println("Danh sách của phương tiện ô tô: ");
        if (cars.isEmpty()) {
            System.out.println("Danh sách trống!!!");
        } else {
            for (Car car : cars
            ) {
                System.out.println(car);
            }
        }
    }

    public void showListMotorbike(List<Motorbike> motorbikes) {
        System.out.println("Danh sách của phương tiện xe máy: ");
        if (motorbikes.isEmpty()) {
            System.out.println("Danh sách trống!!!");
        } else {
            for (Motorbike motorbike : motorbikes
            ) {
                System.out.println(motorbike);
            }
        }
    }

    public void showListTruck(List<Truck> trucks) {
        System.out.println("Danh sách của phương tiện xe tải: ");
        if (trucks.isEmpty()) {
            System.out.println("Danh sách trống!!!");
        } else {
            for (Truck truck : trucks
            ) {
                System.out.println(truck);
            }
        }
    }

    public int showSelectYesNo() {
        System.out.println("Bạn có muốn tiếp tục xem danh sách của các loại phương tiện không?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        return vehicleException.selectYesNo();
    }

    public int showSelectYesNoSearch() {
        System.out.println("Bạn có muốn tiếp tục tìm kiếm phương tiện không?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        return vehicleException.selectYesNo();
    }

    public void showListCarsSearch(List<Car> cars) {
        for (Car car : cars
        ) {
            System.out.println(car);
        }
    }

    public void showListMotorbikesSearch(List<Motorbike> motorbikes) {
        for (Motorbike motorbike : motorbikes
        ) {
            System.out.println(motorbike);
        }
    }

    public void showListTrucksSearch(List<Truck> trucks) {
        for (Truck truck : trucks
        ) {
            System.out.println(truck);
        }
    }
}
