package exception;

import java.util.Scanner;

public class VehicleException {
    private final Scanner scanner = new Scanner(System.in);

    // Vehicle
    public String numberException() {
        while (true) {
            String number;
            try {
                System.out.print("Nhập số máy: ");
                number = scanner.nextLine();
                number = number.trim();
                String regex = "^[0-9]+$";
                if (number.isEmpty()) {
                    System.out.println("Số máy không được để trống!!!");
                } else if (number.matches(regex)) {
                    return number;
                } else if (Double.parseDouble(number) < 0) {
                    System.out.println("Số không được âm!!!");
                } else {
                    System.out.println("Số máy phải là các chữ số nguyên!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Số máy phải là các chữ số nguyên!!!");
            }
        }

    }

    public String inputManufacturer() {
        while (true) {
            String manufacturer;
            System.out.print("Nhập hãng sản xuất: ");
            manufacturer = scanner.nextLine();
            if (manufacturer.trim().isEmpty()) {
                System.out.println("Hãng sản xuất không được để trống!!!");
            } else {
                return manufacturer;
            }
        }
    }

    public String yearValidate() {
        while (true) {
            try {
                System.out.print("Nhập năm sản xuất: ");
                String year = scanner.nextLine();
                year = year.trim();
                if (year.isEmpty()) {
                    System.out.println("Năm sản xuất không được để trống!!!");
                } else if (year.matches("^(19[0-9]{2}|20[0-2][0-3])$")) {
                    return year;
                } else if (Double.parseDouble(year) < 0) {
                    System.out.println("Số nhập vào không được là số âm!!!");
                } else {
                    System.out.println("Năm sản xuất phải sau năm 1900 và trước năm 2024!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!!!");
            }
        }
    }

    public double priceException() {
        while (true) {
            double price;
            try {
                System.out.print("Nhập giá bán: ");
                String number = scanner.nextLine();
                if (number.trim().isEmpty()) {
                    System.out.println("Giá bán không được để trống!!!");
                } else {
                    price = Double.parseDouble(number.trim());
                    if (price < 0) {
                        System.out.println("Giá bán không được là số âm");
                    } else {
                        return price;
                    }
                }
            } catch (NumberFormatException n) {
                System.out.println("Nhập sai định dạng!!!!!");
            }
        }
    }

    // Car
    public int numberOfSeatsValidate() {
        while (true) {
            int numberOfSeats;
            try {
                System.out.print("Nhập số chỗ ngồi: ");
                String number = scanner.nextLine();
                if (number.trim().isEmpty()) {
                    System.out.println("Số chỗ ngồi không được để trống!!!");
                } else {
                    numberOfSeats = Integer.parseInt(number.trim());
                    if (numberOfSeats < 2 || numberOfSeats > 30) {
                        System.out.println("Số chỗ ngồi tối thiểu là 2 và tối đa là 30");
                    } else {
                        return numberOfSeats;
                    }
                }
            } catch (NumberFormatException n) {
                System.out.println("Số chỗ ngồi phải là số nguyên dương!!!");
            }
        }
    }

    public String engineTypeInput() {
        while (true) {
            String engineType;
            System.out.print("Nhập kiểu động cơ: ");
            engineType = scanner.nextLine();
            if (engineType.trim().isEmpty()) {
                System.out.println("Kiểu động cơ không được để trống!!!");
            } else {
                return engineType;
            }
        }
    }

    // Truck
    public double weightException() {
        while (true) {
            double weight;
            try {
                System.out.print("Nhập trọng tải: ");
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Trọng tải không được để trống!!!");
                } else {
                    weight = Double.parseDouble(input.trim());
                    if (weight < 0) {
                        System.out.println("Trọng tải khồn được là số âm!!!");
                    } else {
                        return weight;
                    }
                }
            } catch (NumberFormatException n) {
                System.out.println("Nhập sai định dạng!!!!!");
            }
        }
    }

    // Motorbike
    public int capacityException() {
        while (true) {
            int capacity;
            try {
                System.out.print("Nhập công suất: ");
                String number = scanner.nextLine();
                if (number.trim().isEmpty()) {
                    System.out.println("Công suất không được để trống!!!");
                } else {
                    capacity = Integer.parseInt(number.trim());
                    if (capacity < 0) {
                        System.out.println("Công suất không được là số âm!!!");
                    } else {
                        return capacity;
                    }
                }
            } catch (NumberFormatException n) {
                System.out.println("Nhập sai định dạng!!!!!");
            }
        }
    }

    public int numberOfVehicles() {
        while (true) {
            int number;
            try {
                System.out.print("Nhập vào số lượng phương tiện bạn muốn đăng kí: ");
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Bạn không được để trống!!!");
                } else {
                    number = Integer.parseInt(input.trim());
                    if (number <= 0) {
                        System.out.println("Số nhập vào phải là số nguyên dương và lớn hơn 0!!!");
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào phải là số nguyên dương!!!");
            }
        }
    }

    public int chooseType() {
        while (true) {
            int choose;
            try {
                System.out.print("Nhập lựa chọn: ");
                String empty = scanner.nextLine();
                if (empty.trim().isEmpty()) {
                    System.out.println("Bạn không được để trống lựa chọn này!!!");
                } else {
                    choose = Integer.parseInt(empty.trim());
                    return choose;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!!!");
            }
        }
    }

    public int selectYesNo() {
        while (true) {
            int select;
            try {
                System.out.print("Nhập lựa chọn: ");
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Bạn không được để trống lựa chọn này!!!");
                } else {
                    select = Integer.parseInt(input.trim());
                    if (select < 1 || select > 2) {
                        System.out.println("Bạn phải chọn Yes hoặc No");
                    } else {
                        return select;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải chọn Yes hoặc No");
            }
        }
    }

    public String searchNumber() {
        while (true) {
            String number;
            System.out.print("Nhập số máy bạn muốn tìm kiếm: ");
            number = scanner.nextLine();
            number = number.trim();
            String regex = "^[0-9]+$";
            if (number.isEmpty()) {
                System.out.println("Bạn không được để trống!!!");
            } else if (number.matches(regex)) {
                return number;
            } else {
                System.out.println("Số máy phải là các chữ số nguyên dương!!!");
            }
        }
    }
}
