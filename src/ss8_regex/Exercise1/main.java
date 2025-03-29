package ss8_regex.Exercise1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số điện thoại");
        String sdt = "03[2-9][0-9]{7}";

        System.out.println((sdt.matches("03555555555")));

//        String email = "[a-z]"

    }


}
