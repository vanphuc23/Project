import java.util.Scanner;

enum Function {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn chức năng:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");

        int choice = scanner.nextInt();

        Function function = Function.values()[choice - 1];

        switch (function) {
            case ADD:
                System.out.println("Nhập hai số cần cộng:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Tổng là: " + (a + b));
                break;
            case SUBTRACT:
                System.out.println("Nhập hai số cần trừ:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Hiệu là: " + (a - b));
                break;
            case MULTIPLY:
                System.out.println("Nhập hai số cần nhân:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Tích là: " + (a * b));
                break;
            case DIVIDE:
                System.out.println("Nhập hai số cần chia:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Thương là: " + (a / b));
                break;
        }
    }
}