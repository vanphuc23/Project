public class Student {
    private int MSSV;
    private String name;
    private float diemLT;
    private float diemTH;

    public Student() {
    }

    public Student(int MSSV, String name, float diemLT, float diemTH) {
        this.MSSV = MSSV;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float DTB() {
        return (this.getDiemLT() + this.getDiemTH()) / 2;
    }

    @Override
    public String toString() {
        return MSSV + "         " + name + "          " + diemLT + "            " + diemTH + "          " + DTB();
    }

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
