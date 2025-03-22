package ss3_static.Exercise3;

import java.time.LocalDate;

/**
 * Xây dựng lớp tiện ích LocalDateUtil
 * a. Chuyển đổi chuỗi với định dạng dd//MM/yyyy sang localDate
 * b. Chuyển đổi chuỗi với định dạng yyyy//MM/dd sang localDate
 * c. Chuyển đổi localDate với định dạng sang chuỗi với định dạng dd//MM/yyyy
 * d. Chuyển đổi localDate với định dạng sang chuỗi với định dạng yyyy//MM/dd
 */

public class Main {
    public static void main(String[] args) {
        String dateString1 = "22/03/2025";
        String dateString2 = "2022/11/11";

        LocalDate localDate1 = LocalDateUtil.fromString_ddMMyyyy(dateString1); // 2025-03-22
        LocalDate localDate2 = LocalDateUtil.fromString_yyyyMMdd(dateString2); // 2022-11-11

        System.out.println(localDate1);
        System.out.println(localDate2);

        // Chuyển đổi LocalDate thành chuỗi
        LocalDate currentDate =  LocalDate.now();
        String formattedDate1 = LocalDateUtil.toString_ddMMyyyy(currentDate);
        String formattedDate2 = LocalDateUtil.toString_yyyyMMdd(currentDate);

        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
    }
}
