package ss2_practice_employmanagement;

import java.util.Scanner;

public class ProductionEmployee extends Employee {
    private double numberProduction;

    public ProductionEmployee() {
    }

    public ProductionEmployee(String id, String name, String dayOfBirth, String address, double productQuantity) {
        super(id, name, dayOfBirth, address);
        this.numberProduction = productQuantity;
    }

    public double getNumberProduction() {
        return numberProduction;
    }

    public void setNumberProduction(double numberProduction) {
        this.numberProduction = numberProduction;
    }

    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số sản phẩm: ");
        numberProduction = Double.parseDouble(scanner.nextLine());
    }

    void output() {
        super.output();
        System.out.println("Số sản phẩm là: " + this.numberProduction);
    }

}
