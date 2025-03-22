package ss2_practice_employmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<ManagementEmployee> managementEmployees = new ArrayList<>();
    static ArrayList<ProductionEmployee> productionEmployees = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            int choose;
            do {
                System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN --");
                System.out.println("1. Thêm mới");
                System.out.println("2. Cập nhật");
                System.out.println("3. Xem danh sách");
                System.out.println("4. Sắp xếp theo lương");
                System.out.println("5. Thoát");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuAddNew();
                        break;
                    case 2:
                        menuUpdate();
                        break;
                    case 3:
                        menuShowList();
                        break;
                    case 4:
                        menuSort();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 5);
        }

    }

    private static String getIdManagement() {
        if (managementEmployees.size() == 0) {
            return "QL001";
        }

        // lấy ra id của nhân vien đầu tiên
        // substring(2)); lấy từ vị trí thứ 2 trong chuối "QL001";
        int max = Integer.parseInt(managementEmployees.get(0).getId().substring(2));

        for (int i = 0; i < managementEmployees.size(); i++) {
            int id = Integer.parseInt(managementEmployees.get(i).getId().substring(2));
            if (max < id) {
                max = id;
            }
        }
        // max == 11 => QL012 // 11 đang trùng với thằng lớn nhất nên ta tăng lên 1
        return String.format("QL%3d", max + 1).replace(" ", "0");
    }

    private static String getIdProduction() {
        if (productionEmployees.size() == 0) {
            return "NV001";
        }

        // lấy ra id của nhân vien đầu tiên
        // substring(2)); lấy từ vị trí thứ 2 trong chuối "QL001";
        int max = Integer.parseInt(productionEmployees.get(0).getId().substring(2));

        for (int i = 0; i < productionEmployees.size(); i++) {
            int id = Integer.parseInt(productionEmployees.get(i).getId().substring(2));
            if (max < id) {
                max = id;
            }
        }
        // max == 11 => QL012 // 11 đang trùng với thằng lớn nhất nên ta tăng lên 1
        return String.format("NV%3d", max + 1).replace(" ", "0");
    }

    private static void menuSort() {
        while (true) {
            int choose;
            do {
                System.out.println("-- 4. Sắp xếp theo lương --");
                System.out.println("1. Nhân viên quản lý");
                System.out.println("2. Nhân viên sản xuất");
                System.out.println("3. Tất cả nhân viên");
                System.out.println("4. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuSortManagementEmployee();
                        break;
                    case 2:
                        menuSortProductionEmployee();
                        break;
                    case 3:
                        menuSortAllEmployee();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuSortAllEmployee() {
        while (true) {
            int choose;
            do {
                System.out.println("-- 3. Tất cả nhân viên --");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
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
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 3);
        }
    }

    private static void menuSortProductionEmployee() {
        while (true) {
            int choose;
            do {
                System.out.println("-- 2. Nhân viên sản xuất --");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
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
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 3);
        }
    }

    private static void menuSortManagementEmployee() {
        while (true) {
            int choose;
            do {
                System.out.println("-- 1. Nhân viên quản lý --");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
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
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 3);
        }
    }

    private static void menuShowList() {
        while (true) {
            int choose;
            do {
                System.out.println("-- 3. XEM DANH SÁCH --");
                System.out.println("1. Nhân viên quản lý");
                System.out.println("2. Nhân viên sản xuất");
                System.out.println("3. Tất cả nhân viên");
                System.out.println("4. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("==== Thông tin nhân viên quản lý ====");
                        for (int i = 0; i < managementEmployees.size(); i++) {
                            System.out.println("Thông tin nhân viên quản lý thứ " + (i + 1));
                            managementEmployees.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("==== Thông tin nhân viên sản xuất ====");
                        for (int i = 0; i < productionEmployees.size(); i++) {
                            System.out.println("Thông tin nhân viên sản xuất thứ " + (i + 1));
                            productionEmployees.get(i).output();
                        }
                        break;
                    case 3:
                        // employeeAll();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 4);
        }
    }


    private static void menuAddNew() {
        while (true) {
            int choose;
            do {
                System.out.println("-- 1. THÊM MỚI --");
                System.out.println("1. Nhân viên quản lý");
                System.out.println("2. Nhân viên sản xuất");
                System.out.println("3. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        ManagementEmployee managementEmployee = new ManagementEmployee();
                        managementEmployee.input();
                        managementEmployee.setId(getIdManagement());
                        managementEmployees.add(managementEmployee);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        ProductionEmployee productionEmployee = new ProductionEmployee();
                        productionEmployee.input();
                        productionEmployee.setId(getIdProduction());
                        productionEmployees.add(productionEmployee);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ! Xin vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 3);
        }
    }

    private static void menuUpdate() {
        System.out.println("Nhập vào Id bạn muốn cập nhật: ");
        String id = scanner.nextLine();

        if (id.startsWith("QL")){
            boolean isExistManagementEmployee = false;
            for (int i = 0; i < managementEmployees.size(); i++){
                if (managementEmployees.get(i).getId().equals(id)){
                    isExistManagementEmployee = true;
                    managementEmployees.get(i).input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }

            if (!isExistManagementEmployee){
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }

        }else if (id.startsWith("NV")){

            boolean isExistProductionEmployee = false;
            for (int i = 0; i < productionEmployees.size(); i++){
                if (productionEmployees.get(i).getId().equals(id)){
                    isExistProductionEmployee = true;
                    productionEmployees.get(i).input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }

            if (!isExistProductionEmployee){
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }
        }else {
            System.out.println("Id không hợp lệ");
        }

    }


}
