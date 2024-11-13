package com.hank.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

        public class Tester {
            public static void main(String[] args) {
                LocalDateTime enter = LocalDateTime.of(2018,12,25,8,0,0);
                LocalDateTime leave = LocalDateTime.of(2018,12,25,10,8,0);

                Car car = new Car("AA-0001",enter); //選時區，轉 ms值
                car.setLeave(leave); //1s = 1000ms
                System.out.println(car.getDuration());
                long hours = (long)Math.ceil(car.getDuration()/60.0); // Math.ceil()無條件進位
                System.out.println("停車時間(小時):" + hours);
                System.out.println("停車費用(30):" + hours*30);

//        javeDate(); //java8
//        newDateTime();

    }

    private static void newDateTime() {
    /* 新時間類別：Instant,Local，為 immutable物件
    instant,有「時區」問題（格林威治的標準時間），台灣需 +8
     */
        Instant instant = Instant.now();
        System.out.println("格林威治時間:" + instant);
        //local，本地時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println("台灣時區時間:" + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd_HH:mm:ss");
        System.out.println("台灣自訂格式：" + formatter.format(now));
        System.out.println("加3小時的時間:" + now.plus(Duration.ofHours(3))); //加 3小時，吐出一個新時 原本時間不會改變
        System.out.println("現在時間:" + now);
        //產生日期時間
        LocalDateTime other = LocalDateTime.of(2018,11,23,8,0,0); //月份不用「減 1」
        System.out.println("產生的時間:" + other);
    }

    private static void javaDate() {
        //舊式「日期」類別 date，無法做「運算」
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); //長整數
        //「時間長整數」轉「自訂格式時間」
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
        System.out.println("時間長整數轉自訂時間格式:" + sdf.format(date));
        //字串轉「時間」
        String s = "2018/11/25_08:00:00";
        Date other = null;
        try {
            other = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("字串轉時間(轉date物件):" + other);

        // Calendar物件，可做「運算」，稱「Mutable」物件
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar時間：" + calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println("改為10月:" + calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println("加3天" + calendar.getTime());
    }
}
