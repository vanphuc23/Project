package controller;

import exception.VehicleException;
import model.Car;
import model.Motorbike;
import model.Truck;
import service.*;
import service.impl.ICarService;
import service.impl.IMotorbikeService;
import service.impl.ITruckService;
import view.VehicleView;


import java.util.List;
import java.util.Scanner;

public class VehicleController {
    private final VehicleException vehicleException = new VehicleException();
    private final ICarService iCarService = new CarService();
    private final ITruckService iTruckService = new TruckService();
    private final IMotorbikeService iMotorbikeService = new MotorbikeService();
    private final VehicleView view = new VehicleView();

    enum Function {
        ADD, DISPLAY, SEARCH, EXIT
    }

    public void list() {
        int choose;
        do {
            choose = view.display();
            try {
                Function function = Function.values()[choose - 1];
                switch (function) {

                    // Chức năng thêm mới
                    case ADD:
                        add();
                        break;

                    // Chức năng hiển thị
                    case DISPLAY:
                        display();
                        break;

                    // Chức năng tìm kiếm
                    case SEARCH:
                        search();
                        break;

                    // Thoát
                    case EXIT:
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println("Bạn phải chọn từ 1 -> 4");
            }
        } while (choose != 4);
    }

    enum Add {
        AddNewCar, AddNewMotorbike, AddNewTruck, EXIT
    }

    public void add() {
        int number = vehicleException.numberOfVehicles();
        int choose;
        int i = 0;
        do {
            choose = view.showAdd();
            try {
                Add add = Add.values()[choose - 1];
                switch (add) {

                    // Chức năng thêm mới phương tiện ô tô(Car)
                    case AddNewCar:
                        System.out.println("Nhập thông tin đăng kí của phương tiện thứ " + (i + 1) + " (Car)");
                        iCarService.addCar();
                        i++;
                        break;

                    // Chức năng thêm mới phương tiện xe máy(Motorbike)
                    case AddNewMotorbike:
                        System.out.println("Nhập thông tin đăng kí của phương tiện thứ " + (i + 1) + " (Motorbike)");
                        iMotorbikeService.addMotorbike();
                        i++;
                        break;

                    // Chức năng thêm mới phương tiện xe tải(Truck)
                    case AddNewTruck:
                        System.out.println("Nhập thông tin đăng kí của phương tiện thứ " + (i + 1) + " (Truck)");
                        iTruckService.addTruck();
                        i++;
                        break;

                    // Thoát
                    case EXIT:
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println("Bạn phải chọn từ 1 -> 4");
            }
        } while (choose != 4 && i != number);
    }

    enum Display {
        CarDisplay, MotorbikeDisplay, TruckDisplay, EXIT
    }

    public void display() {
        int choose;
        int select = 0;
        do {
            choose = view.showListOfVehicle();
            try {
                Display display = Display.values()[choose - 1];
                switch (display) {

                    // Chức năng hiển thị danh sách phương tiên ô tô(Car)
                    case CarDisplay:
                        List<Car> cars = iCarService.findAll();
                        view.showListCar(cars);
                        select = view.showSelectYesNo();
                        break;

                    // Chức năng hiển thị danh sách phương tiên xe máy(Motorbike)
                    case MotorbikeDisplay:
                        List<Motorbike> motorbikes = iMotorbikeService.findAll();
                        view.showListMotorbike(motorbikes);
                        select = view.showSelectYesNo();
                        break;

                    // Chức năng hiển thị danh sách phương tiên xe tải(Truck)
                    case TruckDisplay:
                        List<Truck> trucks = iTruckService.findAll();
                        view.showListTruck(trucks);
                        select = view.showSelectYesNo();
                        break;

                    // Thoát
                    case EXIT:
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println("Bạn phải chọn từ 1 -> 4");
            }
        } while (choose != 4 && select != 2);
    }

    enum Search {
        SearchVehicleByNumber, SearchVehicleByManufacturer, EXIT
    }

    public void search() {
        int choose;
        int select = 0;
        List<Car> cars;
        List<Motorbike> motorbikes;
        List<Truck> trucks;
        do {
            choose = view.showSearch();
            try {
                Search search = Search.values()[choose - 1];
                switch (search) {

                    // Tìm kiếm phương tiện theo số máy
                    case SearchVehicleByNumber:
                        String number = vehicleException.searchNumber();
                        cars = iCarService.searchCar(number);
                        motorbikes = iMotorbikeService.searchMotorbike(number);
                        trucks = iTruckService.searchTruck(number);
                        if (cars.isEmpty() && motorbikes.isEmpty() && trucks.isEmpty()) {
                            System.out.println("Số máy " + number + " không tìm thấy!!!");
                        } else {
                            System.out.println("-- Danh sách tìm kiếm được --");
                            view.showListCarsSearch(cars);
                            view.showListMotorbikesSearch(motorbikes);
                            view.showListTrucksSearch(trucks);
                        }
                        select = view.showSelectYesNoSearch();
                        break;

                    // Tìm kiếm phương tiện theo hãng sản xuất
                    case SearchVehicleByManufacturer:
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Nhập hãng sản xuất muốn tìm kiếm: ");
                        String manufacturer = scanner.nextLine();
                        cars = iCarService.searchManufacturerOfCar(manufacturer);
                        motorbikes = iMotorbikeService.searchManufacturerOfMotorbike(manufacturer);
                        trucks = iTruckService.searchManufacturerOfTruck(manufacturer);
                        if (cars.isEmpty() && motorbikes.isEmpty() && trucks.isEmpty()) {
                            System.out.println("Hãng sản xuất " + manufacturer + " không tìm thấy!!!");
                        } else {
                            System.out.println("-- Danh sách tìm kiếm được --");
                            view.showListCarsSearch(cars);
                            view.showListMotorbikesSearch(motorbikes);
                            view.showListTrucksSearch(trucks);
                        }
                        select = view.showSelectYesNoSearch();
                        break;

                    // Thoát
                    case EXIT:
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException ignored) {
                System.out.println("Bạn phải chọn từ 1 -> 3");
            }
        } while (choose != 3 && select != 2);
    }
}
