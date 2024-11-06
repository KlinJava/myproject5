package com.hank.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //map<key,value> , key不可重覆,無index,無順序
        //value值，後面相同者，會蓋掉前面的
        HashMap<String, String > stocks =
                new HashMap<>();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330","TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String s : stocks.keySet()){
            System.out.print(s+"\t");
            System.out.println(stocks.get(s));
        }

//        set();
//        list();
//        arrayTest();
    }

    private static void set() {
        //set,無「次序、index」,適合放「不重覆」的資料
        //HashSet,無排序功能
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        System.out.println(set);
        for (int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        //list,有「順序、索引(index)、可重覆」
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68,88,77,99,50);
        System.out.println("使用for each");
        for (int n : scores) {
            System.out.println(n);
        }
        System.out.println("使用for");
        for (int i=0; i<5; i++){
            System.out.println(scores.get(i));
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 7;
        int[] scores = {68,88,77,99,50};
        System.out.println(scores);
        System.out.println("方法1");
        for (int i=0; i<5; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("方法2");
        for (int n : scores) {
            System.out.println(n);
        }
    }
}
