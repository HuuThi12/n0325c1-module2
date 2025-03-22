package ss3_static.Exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Xây dựng lớp tiện ích LocalDateUtil
 * a. Chuyển đổi chuỗi với định dạng dd//MM/yyyy sang localDate
 * b. Chuyển đổi chuỗi với định dạng yyyy//MM/dd sang localDate
 * c. Chuyển đổi localDate với định dạng sang chuỗi với định dạng dd//MM/yyyy
 * d. Chuyển đổi localDate với định dạng sang chuỗi với định dạng yyyy//MM/dd
 */
public class LocalDateUtil {

    // Định dạng chuỗi ngày tháng dd//MM/yyyy
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Định dạng chuỗi ngày tháng yyyy//MM/dd
    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // Phương thức tĩnh để chuyển đổi chuỗi với định dạng dd//MM/yyyy sang localDate
    public static LocalDate fromString_ddMMyyyy(String date){
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    // Phương thức tĩnh để chuyển đổi chuỗi với định dạng yyyy//MM/dd sang localDate
    public static LocalDate fromString_yyyyMMdd(String date){
        return LocalDate.parse(date,formatter_yyyyMMdd);
    }

    //
    public static String toString_ddMMyyyy(LocalDate date){
        return date.format(formatter_ddMMyyyy);
    }

    public static String toString_yyyyMMdd(LocalDate date){
        return date.format(formatter_yyyyMMdd);
    }



}
