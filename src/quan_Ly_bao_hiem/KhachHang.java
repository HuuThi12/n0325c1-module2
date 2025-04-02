package quan_Ly_bao_hiem;

import quan_Ly_bao_hiem.BaoHiem;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private String ngaySinh;
    private String noiThuongTru;
    private String soCMND;
    private BaoHiem baoHiem;

    public KhachHang() {
    }

    public KhachHang(String hoTen, String ngaySinh, String noiThuongTru, String soCMND, BaoHiem baoHiem) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiThuongTru = noiThuongTru;
        this.soCMND = soCMND;
        this.baoHiem = baoHiem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiThuongTru() {
        return noiThuongTru;
    }

    public void setNoiThuongTru(String noiThuongTru) {
        this.noiThuongTru = noiThuongTru;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public BaoHiem getBaoHiem() {
        return baoHiem;
    }

    public void setBaoHiem(BaoHiem baoHiem) {
        this.baoHiem = baoHiem;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên: ");
        hoTen = scanner.nextLine();

        System.out.println("Nhập vào ngày sinh: ");
        ngaySinh = scanner.nextLine();

        System.out.println("Nhập vào nơi thường trú: ");
        noiThuongTru = scanner.nextLine();

        System.out.println("Nhập vào số chứng minh thư");
        soCMND = scanner.nextLine();
    }

    void output() {
        System.out.print("Hhọ tên: " + hoTen);

        System.out.print("Ngày sinh: " + ngaySinh);

        System.out.print("Nơi thường trú: " + noiThuongTru);

        System.out.print("Số chứng minh thư" + soCMND);
    }
}
