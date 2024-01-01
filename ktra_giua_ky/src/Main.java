public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student(123, "Nguyễn Văn A", 8, 9);
        Student sv2 = new Student(1234, "Nguyễn Văn B", 9, 10);
        Student sv3 = new Student();
        int mssvOfSv3 = 111;
        String nameOfSv3 = "Nguyễn Văn  C";
        float diemLTOfSv3 = 8.5F;
        float diemTHOfSv3 = 8.5F;
        sv3.setMSSV(mssvOfSv3);
        sv3.setName(nameOfSv3);
        sv3.setDiemLT(diemLTOfSv3);
        sv3.setDiemTH(diemTHOfSv3);
        System.out.println("MSSV     |     Họ tên        |   Điểm LT   |   Điểm TH   |   Điểm TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}