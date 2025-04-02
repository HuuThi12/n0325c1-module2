package quan_Ly_bao_hiem;

import java.util.Scanner;

public class BaoHiemTheoHopDong extends BaoHiem{
    private String thoiGianKetThuc;
    private String sanPhamBaoHiemDiKem;

    public BaoHiemTheoHopDong() {
    }

    public BaoHiemTheoHopDong(String thoiGianKetThuc, String sanPhamBaoHiemDiKem) {
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.sanPhamBaoHiemDiKem = sanPhamBaoHiemDiKem;
    }


    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getSanPhamBaoHiemDiKem() {
        return sanPhamBaoHiemDiKem;
    }

    public void setSanPhamBaoHiemDiKem(String sanPhamBaoHiemDiKem) {
        this.sanPhamBaoHiemDiKem = sanPhamBaoHiemDiKem;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thời gian kết thúc: ");
        thoiGianKetThuc = scanner.nextLine();

        System.out.println("Nhập vào thời sản phẩm bảo hiểm đi kèm: ");
        sanPhamBaoHiemDiKem = scanner.nextLine();
    }

    void output(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thời gian kết thúc: " + thoiGianKetThuc);

        System.out.print("Sản phẩm bảo hiểm đi kèm: " + sanPhamBaoHiemDiKem);
    }

}
