package SortDemo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Timeutil {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("当前日期 "+now);//2020-03-19

        LocalTime now1 = LocalTime.now();
        System.out.println("当前时间 "+now1);//21:51:30.437

        Instant now2 = Instant.now();
        System.out.println("当前时间 "+now2);//2020-03-19T13:57:05.754Z

        LocalDateTime now3 = LocalDateTime.now();
        System.out.println("当前时间 "+now3);//2020-03-19T21:57:05.766


    }
}
