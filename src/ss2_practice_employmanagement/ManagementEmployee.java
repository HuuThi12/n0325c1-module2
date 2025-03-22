package ss2_practice_employmanagement;

import java.util.Scanner;

public class ManagementEmployee extends Employee {
    private double basisSalary;
    private double conffidentSalary;

    public ManagementEmployee() {
    }

    public ManagementEmployee(String id, String name, String dayOfBirth, String address, double salary, double numberSalary) {
        super(id, name, dayOfBirth, address);
        this.basisSalary = salary;
        this.conffidentSalary = numberSalary;
    }

    public double getBasisSalary() {
        return basisSalary;
    }

    public void setBasisSalary(double basisSalary) {
        this.basisSalary = basisSalary;
    }

    public double getConffidentSalary() {
        return conffidentSalary;
    }

    public void setConffidentSalary(double conffidentSalary) {
        this.conffidentSalary = conffidentSalary;
    }

    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào lương cơ bản: ");
        basisSalary = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập vào hệ số lương: ");
        conffidentSalary = Double.parseDouble(scanner.nextLine());
    }

    void output() {
        super.output();
        System.out.println("Lương cơ bản: " + this.basisSalary);
        System.out.println("Hệ số lương: " + this.conffidentSalary);
    }
}
