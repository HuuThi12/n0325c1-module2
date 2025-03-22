package ss4_extend.phone_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            int choose;
            do {
                System.out.println("==== CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI ====");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");

                System.out.print("Nhập vào lựa chọn của bạn: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        menuShowList();
                        break;
                    case 2:
                        menuAdd();
                        break;
                    case 3:
                        menuUpdate();
                        break;
                    case 4:
                        menuDelete();
                        break;
                    case 5:
                        menuSort();
                        break;
                    case 6:
                        menuSearch();
                        break;
                    case 7:
                        // code logic tại đây
                        break;
                    case 8:
                        // code logic tại đây
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");

                }
            } while ((choose < 1) || (choose > 9));
        }


    }

    private static void menuDelete() {
        System.out.println("Nhập vào mã muốn xóa");
        String id = scanner.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExitPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExitPhone = true;
                    System.out.printf("Bạn có muốn xóa điện thoại cũ có mã %s không \n", id);
                    System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
                    if ("yes".equalsIgnoreCase(scanner.nextLine())) {
                        oldPhones.remove(oldPhone);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Đã hủy việc xóa!");
                    }
                    break;
                }
            }
            if (!isExitPhone) {
                System.out.println("Không tìm thấy Id muốn xóa");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExitPhone = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExitPhone = true;
                    System.out.printf("Bạn có muốn xóa điện thoại mới có mã %s không \n", id);
                    System.out.println("Chọn yes để xác nhận xóa, No để hủy");
                    if ("yes".equalsIgnoreCase(scanner.nextLine())) {
                        System.out.println("Đã xóa thành công!");
                    } else {
                        System.out.println("Đã hủy việc xóa");
                    }
                    break;
                }
            }
            if (!isExitPhone) {
                System.out.println("Không tìm thấy Id muốn xóa");
            }
        } else {
            System.out.println("Id bạn vừa nhập không hợp lệ! Xin vui lòng nhập lại");
        }
    }

    private static void menuUpdate() {
        System.out.println("Nhập vào Id bạn muốn cập nhật: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC")) {
            // isExist: Tồn tại
            boolean isExistOldPhone = false;
            for (int i = 0; i < oldPhones.size(); i++) {
                if (oldPhones.get(i).getId().equals(id)) {
                    isExistOldPhone = true;
                    oldPhones.get(i).input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExistOldPhone) {
                System.out.println("Không tìm thấy Id muốn cập nhật");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExistNewPhone = false;
            for (int i = 0; i < newPhones.size(); i++) {
                if (newPhones.get(i).getId().equals(id)) {
                    isExistNewPhone = true;
                    newPhones.get(i).input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExistNewPhone) {
                System.out.println("Không tìm thấy Id muốn cập nhật");
            }
        } else {
            System.out.println("Id không hợp lệ");
        }
    }

    private static void menuSort() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 5. Sắp xếp theo giá ====");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        // code logic tại đây
                        break;
                    case 2:
                        // code logic tại đây
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 3));
        }
    }

    private static void menuSearch() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 6. Tìm kiếm ====");
                System.out.println("1. Tìm tất cả các loại điện thoại");
                System.out.println("2. Tìm kiếm điện thoại củ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        menuSearchAllPhone();
                        break;
                    case 2:
                        menuSearchOldPhone();
                        break;
                    case 3:
                        menuSearchNewPhone();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 4));
        }

    }

    private static void menuSearchNewPhone() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 6. Tìm kiếm ====");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        // code logic tại đây
                        break;
                    case 2:
                        // code logic tại đây
                        break;
                    case 3:
                        // code logic tại đây
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 4));
        }
    }

    private static void menuSearchOldPhone() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 6. Tìm kiếm ====");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        // code logic tại đây
                        break;
                    case 2:
                        // code logic tại đây
                        break;
                    case 3:
                        // code logic tại đây
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 4));
        }
    }

    private static void menuSearchAllPhone() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 6. Tìm kiếm ====");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        // code logic tại đây
                        break;
                    case 2:
                        // code logic tại đây
                        break;
                    case 3:
                        // code logic tại đây
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 4));
        }

    }

    private static String getIdOldPhone() {
        if (oldPhones.size() == 0) {
            return "DTC001";
        }

        // oldPhones.get(0).getId(): lấy ra id của điện thoại cũ đầu tiên
        // substring(3)); lấy từ vị trí thứ 3 trong chuối "DTC001";
        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));

        for (int i = 0; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        // max == 11 => DTC012 // 11 đang trùng với thằng lớn nhất nên ta tăng lên 1
        return String.format("DTC%3d", max + 1).replace(" ", "0");
    }

    private static String getIdNewPhone() {
        if (newPhones.size() == 0) {
            return "DTM001";
        }

        // newPhones.get(0).getId(): lấy ra id của điện thoại mới đầu tiên
        // substring(3)); lấy từ vị trí thứ 3 trong chuối "DTC001";
        int max = Integer.parseInt(newPhones.get(0).getId().substring(3));

        for (int i = 0; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        // max == 11 => DTM012 // 11 đang trùng với thằng lớn nhất nên ta tăng lên 1
        return String.format("DTM%3d", max + 1).replace(" ", "0");
    }

    private static void menuAdd() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 2. Thêm mới ====");
                System.out.println("1. Thêm điện thoại cũ");
                System.out.println("2. Thêm điện thoại mới");
                System.out.println("3. Trở về menu chính");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(getIdOldPhone());
                        oldPhones.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        newPhones.add(newPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 3));
        }
    }

    private static void menuShowList() {
        while (true) {
            int choose;
            do {
                System.out.println("==== 1. Xem danh sách điên thoại ====");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.println("Nhập vào lựa chọn của bạn");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        // code logic tại đây
                        break;
                    case 2:
                        System.out.println("Thông tin điện thoại cũ");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại cũ thứ " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("Thông tin điện thoại mới");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại mới thứ " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 3));
        }

    }
}
