package ss10.phone_management;

import java.util.Scanner;

public class OldPhone extends Phone {
    private int batteryPercentage; // phần trăm pin
    private String decription;

    public OldPhone() {
    }

    public OldPhone(String id, String name, double price, int warranty, String manufacturer, int batteryPercentage, String decription) {
        super(id, name, price, warranty, manufacturer);
        this.batteryPercentage = batteryPercentage;
        this.decription = decription;
    }

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhập vào tình trạng pin (%): ");
        batteryPercentage = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào mô tả thêm: ");
        decription = scanner.nextLine();
    }

    @Override
    void output() {
        super.output();
        System.out.println("Tình trạng pin: " + this.batteryPercentage);

        System.out.println("Mô tả thêm: " + this.decription);
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }


}
