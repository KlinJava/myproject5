package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        Calendar now = Calendar.getInstance();
        System.out.println("今天是當年的第 " + now.get(Calendar.DAY_OF_YEAR) + "天");
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1; //預設 index=0~11，故 +1
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please enter year:(" + year + ")");
            String yearString = reader.readLine();
            year = (yearString.length() > 0)? Integer.parseInt(yearString) : year; //三元運算式
            System.out.println(year);
            System.out.print("Please enter month:(" + month + ")");
            String monthString = reader.readLine();
            month = (monthString.length() > 0)? Integer.parseInt(monthString) : month;
            System.out.println(month);
            System.out.print("Please enter day:(" + day + ")");
            String dayString = reader.readLine();
            day = (dayString.length() > 0)? Integer.parseInt(dayString) : day;
            System.out.println(day);
            int days = 0;
            for (int i=0; i<month-1;i++) {
                days += months[i];
            }
            days = days + day;
            now.isLenient(); //判斷是否為「潤年」
            if (year % 400 == 0  || (year %4 == 0 && year % 100 != 0)) {
                System.out.print(year + " 為「潤年」:");
                days++;
            }
            System.out.println(days);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
