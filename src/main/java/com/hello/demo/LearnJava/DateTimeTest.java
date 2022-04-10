package com.hello.demo.LearnJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeTest {

    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println("Now date: " + nowDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Current calendar: " + calendar.getTime());

        System.out.println("==========================");
        // LocalTime 不带时区的时间
        LocalDate date = LocalDate.ofYearDay(2022, 350); // 获取2022年的第350 天
        System.out.println(date);

        date = LocalDate.of(2021, Month.AUGUST, 30);
        System.out.println(date);

        System.out.println("==========================");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime = LocalTime.of(22, 10);
        System.out.println(localTime);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ldt = LocalDateTime.of(2023, 1, 31, 11, 50, 30);
        System.out.println(ldt);
        ldt = ldt.plusHours(3).plusMinutes(30);
        System.out.println(ldt);

        System.out.println("===================== Date format =================");

        Date dateNow = new Date(); 
        System.out.println(DateFormat.getDateInstance().format(dateNow));
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA).format(dateNow));
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA).format(dateNow));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA).format(dateNow));
        
        System.out.println("=====================================================");

        System.out.println(DateFormat.getTimeInstance().format(dateNow));
        System.out.println(DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA).format(dateNow));
        System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA).format(dateNow));
        System.out.println(DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA).format(dateNow));


        System.out.println("===================== Simple Date format =================");
        SimpleDateFormat sdate = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdate.format(new Date()));

    }
    
}
