package ss10.phone_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    //    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
//    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();

    static {
        // Thêm điện thoại củ
        phones.add(new OldPhone("DTC001", "Iphone 11 Promax",
                1100, 10, "Apple", 65,
                "Đã qua sử dụng, tình trạng tốt"));

        phones.add(new OldPhone("DTC002", "Iphone 13 Promax",
                1300, 20, "Apple", 80,
                "Đã qua sử dụng, màn hình nứt nhẹ"));

        // Thêm điện thoại mới
        phones.add(new NewPhone("DTM001", "Samsung Galaxy s22 ultra",
                2200, 10, "Sam sung", 20));

        phones.add(new NewPhone("DTM002", "Samsung Galaxy s25 ultra",
                2500, 5, "Sam sung", 12));
    }

    public static void main(String[] args) {

        while (true) {
            int choose;
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
        }


    }

    private static void menuDelete() {
        System.out.println("Nhập vào mã muốn xóa");
        String id = scanner.nextLine();

        if (id.startsWith("DTC") || id.startsWith("DTM")) {
            boolean isExitPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExitPhone = true;
                    System.out.printf("Bạn có muốn xóa điện thoại cũ có mã %s không \n", id);
                    System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
                    if ("yes".equalsIgnoreCase(scanner.nextLine())) {
                        phones.remove(phone);
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
            for (int i = 0; i < phones.size(); i++) {
                if (phones.get(i).getId().equals(id) & phones.get(i) instanceof OldPhone) {
                    isExistOldPhone = true;
                    phones.get(i).input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExistOldPhone) {
                System.out.println("Không tìm thấy Id muốn cập nhật");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExistNewPhone = false;
            for (int i = 0; i < phones.size(); i++) {
                if (phones.get(i).getId().equals(id)) {
                    isExistNewPhone = true;
                    phones.get(i).input();
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

    private static void Update() {
        System.out.println("Nhập vào Id bạn muốn cập nhật: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC") || id.startsWith("DTM")) {
            // isExist: Tồn tại
            boolean isExistOldPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExistOldPhone = true;
                    phone.input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExistOldPhone) {
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
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; i < phones.size(); j++) {
                                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);

                                }
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; i < phones.size(); j++) {
                                if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);

                                }
                            }
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 3));
        }
    }

    // các tính năng tìm kiếm chưa hoàn thành
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
                // lấy ra danh sách điện thoại mới từ danh sách điện thoại
                ArrayList<NewPhone> newPhones = new ArrayList<>();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào giá bạn muốn tìm: ");
                        System.out.println("Nhập vào giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhập vào giá đến");
                        int priceTo = Integer.parseInt(scanner.nextLine());

                        int count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào tên bạn muốn tìm");
                        String name = scanner.nextLine();

                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào tên hãng bạn muốn tìm: ");
                        String manuFactuner = scanner.nextLine();
                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getManufacturer().contains(manuFactuner)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
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

                // lấy ra danh sách điện thoại củ từ danh sách điện thoại
                ArrayList<OldPhone> oldPhones = new ArrayList<>();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào giá muốn tìm :");
                        System.out.println("Nhập vào giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhập vào giá đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());

                        int count = 1;
                        for (Phone phone : oldPhones) {
                            // Kiểm tra xem giá đó có nằm trong khoảng người dùng nhập vào (priceFrom đến priceTo).
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào tên cần tìm: ");
                        String name = scanner.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            // Phương thức contains kiểm tra nếu phone.getName() có chứa chuỗi của name => true
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào hãng điện thoại cần tìm: ");
                        String manuFactuner = scanner.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getManufacturer().contains(manuFactuner)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Xin vui lòng chọn lại!");
                }
            } while ((choose < 1) || (choose > 4));
        }
    }


    // các tính năng tìm kiếm chưa hoàn thành
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
                        System.out.println("Nhập vào giá bạn muốn tìm: ");
                        System.out.println("Nhập vào giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhập vào giá đến");
                        int priceTo = Integer.parseInt(scanner.nextLine());

                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào tên bạn muốn tìm");
                        String name = scanner.nextLine();

                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào tên hãng bạn muốn tìm: ");
                        String manuFactuner = scanner.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getManufacturer().contains(manuFactuner)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
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
        ArrayList<OldPhone> oldPhones = getOldPhones();
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

    private static ArrayList<OldPhone> getOldPhones() {
        ArrayList<OldPhone> oldPhones = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i) instanceof NewPhone) {
                oldPhones.add((OldPhone) phones.get(i));
            }
        }
        return oldPhones;
    }

    // lọc ra điện thoại cũ
    private static ArrayList<OldPhone> getIdOldPhones() {
        ArrayList<OldPhone> oldPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                oldPhones.add((OldPhone) phone);
            }
        }
        return oldPhones;
    }


    private static String getIdNewPhone() {
        // lấy ra danh sách điện thoại mới từ danh sách điện thoại
        ArrayList<NewPhone> newPhones = getIdNewPhones();
        if (phones.size() == 0) {
            return "DTM001";
        }

        // newPhones.get(0).getId(): lấy ra id của điện thoại mới đầu tiên
        // substring(3)); lấy từ vị trí thứ 3 trong chuối "DTC001";
        int max = Integer.parseInt(phones.get(0).getId().substring(3));

        for (int i = 0; i < phones.size(); i++) {
            int id = Integer.parseInt(phones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        // max == 11 => DTM012 // 11 đang trùng với thằng lớn nhất nên ta tăng lên 1
        return String.format("DTM%3d", max + 1).replace(" ", "0");
    }

    // lọc ra điện thoại mới
    private static ArrayList<NewPhone> getIdNewPhones() {
        ArrayList<NewPhone> newPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                newPhones.add((NewPhone) phone);
            }
        }
        return newPhones;
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
                        phones.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        phones.add(newPhone);
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
                        System.out.println("Thông tin tất cả điện thoại :");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            phones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("Thông tin điện thoại cũ");
                        int count = 1;
                        for (int i = 0; i < phones.size(); i++) {
                            if (phones.get(i) instanceof OldPhone) {
                                System.out.println("Thông tin điện thoại cũ thứ " + count++);
                                phones.get(i).output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Thông tin điện thoại mới");
                        count = 1;
                        for (int i = 0; i < phones.size(); i++) {
                            if (phones.get(i) instanceof NewPhone) {
                                System.out.println("Thông tin điện thoại mới thứ " + count++);
                                phones.get(i).output();
                            }
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
