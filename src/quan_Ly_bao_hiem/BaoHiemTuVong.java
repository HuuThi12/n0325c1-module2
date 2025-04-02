package quan_Ly_bao_hiem;

import java.util.Scanner;

public class BaoHiemTuVong extends BaoHiem {
    private String loaiBH;
    private int thoiGianToiThieuThamGia;

    public BaoHiemTuVong() {
    }

    public BaoHiemTuVong(String tenGoi, int thoiHan, double mucPhi, String mucDich, String cachThucDongPhi, String thoiGianBatDau, String loaiBH, int thoiGianToiThieuThamGia) {
        super(tenGoi, thoiHan, mucPhi, mucDich, cachThucDongPhi, thoiGianBatDau);
        this.loaiBH = loaiBH;
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }

    public String getLoaiBH() {
        return loaiBH;
    }

    public void setLoaiBH(String loaiBH) {
        this.loaiBH = loaiBH;
    }

    public int getThoiGianToiThieuThamGia() {
        return thoiGianToiThieuThamGia;
    }

    public void setThoiGianToiThieuThamGia(int thoiGianToiThieuThamGia) {
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào loại trường hợp bảo hiểm: " );
        loaiBH = scanner.nextLine();

        System.out.println("Nhập vào thời gian tối thiểu tham gia: " );
        thoiGianToiThieuThamGia = scanner.nextInt();

    }

    void output(){
        System.out.println("Loại trường hợp bảo hiểm: " + loaiBH);

        System.out.println("Thời gian tối thiểu tham gia: " + thoiGianToiThieuThamGia);
    }



}
