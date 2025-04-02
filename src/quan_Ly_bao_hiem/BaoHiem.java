package quan_Ly_bao_hiem;

import java.util.Scanner;

public abstract class BaoHiem {
    private String tenGoi;
    private int thoiHan;
    private double mucPhi;
    private String mucDich;
    private String cachThucDongPhi;
    private String thoiGianBatDau;

    public BaoHiem() {
    }

    public BaoHiem(String tenGoi, int thoiHan, double mucPhi, String mucDich, String cachThucDongPhi, String thoiGianBatDau) {
        this.tenGoi = tenGoi;
        this.thoiHan = thoiHan;
        this.mucPhi = mucPhi;
        this.mucDich = mucDich;
        this.cachThucDongPhi = cachThucDongPhi;
        this.thoiGianBatDau = thoiGianBatDau;
    }


    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public int getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(int thoiHan) {
        this.thoiHan = thoiHan;
    }

    public void setMucPhi(double mucPhi) {
        this.mucPhi = mucPhi;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public String getCachThucDongPhi() {
        return cachThucDongPhi;
    }

    public void setCachThucDongPhi(String cachThucDongPhi) {
        this.cachThucDongPhi = cachThucDongPhi;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên bảo hiểm: ");
        tenGoi = scanner.nextLine();

        System.out.println("Nhập vào thời hạn đóng: ");
        thoiHan = scanner.nextInt();

        System.out.println("Nhập vào mức phí đóng: ");
        mucPhi = scanner.nextDouble();

        System.out.println("Nhập mục đích: ");
        mucDich = scanner.nextLine();

        System.out.println("Nhập vào cách thức đóng: ");
        cachThucDongPhi = scanner.nextLine();

        System.out.println("Nhập vào thời gian bắt đầu: ");
        thoiGianBatDau = scanner.nextLine();

    }

    void output() {
        System.out.print("Tên bảo hiểm: " + tenGoi);

        System.out.print("Thời hạn đóng: " + thoiHan);

        System.out.print("Mức phí đóng: " + mucPhi);

        System.out.print("Mục đích: " + mucDich);

        System.out.print("Cách thức đóng: " + cachThucDongPhi);

        System.out.print("Thời gian bắt đầu: " + thoiGianBatDau);
    }


}
