package ss10.phone_management;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    public NewPhone() {
    }

    public NewPhone(String id, String name, double price, int warranty, String manufacturer, int quantity) {
        super(id, name, price, warranty, manufacturer);
        this.quantity = quantity;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhập vào số lượng: ");
        quantity = Integer.parseInt(scanner.nextLine());
    }

    void output() {
        super.output();
        System.out.println("Số lượng: " + this.quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
