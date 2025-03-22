package ss2_practice_employmanagement;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String dayOfBirth;
    private String address;


    public Employee() {
    }

    public Employee(String id, String name, String dayOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào ngày sinh: ");
        dayOfBirth = scanner.nextLine();

        System.out.print("Nhập vào địa chỉ: ");
        address = scanner.nextLine();
    }

    void output() {
        System.out.println("Id: " + this.id);

        System.out.println("Tên: " + this.name);

        System.out.println("Ngày sinh: " + this.dayOfBirth);

        System.out.println("Địa chỉ: " + this.address);
    }
}
