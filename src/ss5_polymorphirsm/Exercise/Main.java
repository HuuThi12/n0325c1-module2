package ss5_polymorphirsm.Exercise;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien1 = new SinhVien();
        HocVien hocVien2 = (SinhVien) hocVien1;
        ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
    }
}
