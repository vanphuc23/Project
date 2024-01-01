import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();
        int giaithua = 1;
        for (int i = 2; i <= number; i++) {
            giaithua *= i;
        }
        System.out.println("Giai thừa  của " + number + " bằng = " + giaithua);
        int luachon;
        do {
            System.out.println("Nhập vào 1 để tiếp tục tính giai thừa cho 1 số nguyên khác");
            System.out.println("Nhập vào 0 để dừng chương trình");
            System.out.print("Nhập lựa chọn: ");
            luachon = scanner.nextInt();
            if (luachon == 1) {
                giaithua = 1;
                System.out.print("Nhập số nguyên: ");
                number = scanner.nextInt();
                for (int i = 2; i < number; i++) {
                    giaithua *= i;
                }
                System.out.println("Giai thừa  của " + number + " bằng = " + giaithua);
            }
        } while (luachon == 1);
    }
}
