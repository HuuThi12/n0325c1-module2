package quan_Ly_bao_hiem;

import java.util.Scanner;

public class BaoHiemSinhKy extends BaoHiem{
    private String thoiGianKetThuc;
    private String thoiGianTroCap;

    public BaoHiemSinhKy() {
    }

    public BaoHiemSinhKy(String thoiGianKetThuc, String thoiGianTroCap) {
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.thoiGianTroCap = thoiGianTroCap;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getThoiGianTroCap() {
        return thoiGianTroCap;
    }

    public void setThoiGianTroCap(String thoiGianTroCap) {
        this.thoiGianTroCap = thoiGianTroCap;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thời gian kết thúc: ");
        thoiGianKetThuc = scanner.nextLine();

        System.out.println("Nhập vào thời gian trợ cấp: ");
        thoiGianTroCap = scanner.nextLine();
    }

    void output(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thời gian kết thúc: " + thoiGianKetThuc);

        System.out.print("Thời gian trợ cấp: " + thoiGianTroCap);
    }



}
