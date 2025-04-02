package quan_Ly_bao_hiem;


import ss10.phone_management.NewPhone;
import ss10.phone_management.OldPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<KhachHang> khachHangs = new ArrayList<>();
    static List<BaoHiem> baoHiems = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Nhập nơi thường trú: ");
        String noiThuongTru = sc.nextLine();
        System.out.print("Nhập số CMND: ");
        String soCMND = sc.nextLine();

        while (true) {
            int choose;
            do {
                System.out.println("Chọn loại bảo hiểm: 1. Tử vong 2. Sinh kỳ 3. Thời hạn");
                System.out.println("==== CHỌN LOẠI BẢO HIỂM ====");
                System.out.println("1. Bảo hiểm tử vong");
                System.out.println("2. Bảo hiểm sinh kỳ");
                System.out.println("3. Bảo hiểm theo thời hạn hợp đồng");
                System.out.println("4. Hiển thị thông tin bảo hiểm");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        BaoHiemTuVong baoHiemTuVong = new BaoHiemTuVong();
                        baoHiemTuVong.input();
                        baoHiems.add(baoHiemTuVong);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        BaoHiemSinhKy baoHiemSinhKy = new BaoHiemSinhKy();
                        baoHiemSinhKy.input();
                        baoHiems.add(baoHiemSinhKy);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        BaoHiemTheoHopDong baoHiemTheoHopDong = new BaoHiemTheoHopDong();
                        baoHiemTheoHopDong.input();
                        baoHiems.add(baoHiemTheoHopDong);
                        System.out.println("Thêm mới thành công");
                    case 4:
                        System.out.println("Thông tin bảo hiểm :");
                        for (int i = 0; i < baoHiems.size(); i++) {
                            System.out.println("Thông tin bảo hiểm thứ " + (i + 1));
                            baoHiems.get(i).output();
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 3));
        }


    }

//    private static void menuShowList() {
//        while (true) {
//            int choose;
//            do {
//                System.out.println("==== THÔNG TIN BẢO HIỂM ====");
//
//                choose = Integer.parseInt(scanner.nextLine());
//                switch (choose) {
//                    case 1:
//                        System.out.println("Thông tin tất cả điện thoại :");
//                        for (int i = 0; i < phones.size(); i++) {
//                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
//                            phones.get(i).output();
//                        }
//                        break;
//                    case 2:
//                        System.out.println("Thông tin điện thoại cũ");
//                        int count = 1;
//                        for (int i = 0; i < phones.size(); i++) {
//                            if (phones.get(i) instanceof OldPhone) {
//                                System.out.println("Thông tin điện thoại cũ thứ " + count++);
//                                phones.get(i).output();
//                            }
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Thông tin điện thoại mới");
//                        count = 1;
//                        for (int i = 0; i < phones.size(); i++) {
//                            if (phones.get(i) instanceof NewPhone) {
//                                System.out.println("Thông tin điện thoại mới thứ " + count++);
//                                phones.get(i).output();
//                            }
//                        }
//                        break;
//                    case 4:
//                        return;
//                    default:
//                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
//                }
//            } while ((choose < 1) || (choose > 3));
//        }
//
//    }

    private static void menuBaoHiemThoiHan(

    ) {

    }

    private static void menuBaoHiemSinhKy() {
    }

    private static void menuBHTuVong() {
    }



}
