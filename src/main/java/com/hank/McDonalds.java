package com.hank;

import java.io.*;
import java.util.*;

public class McDonalds {
    Map<String,Item> menu = new HashMap<>();
    public McDonalds() {
        File file = new File("mcdonalds.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]));
                menu.put(item.id, item);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("讀取menu失敗");
        }
    }

    public void printMenu(){
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.toString());
        }
        System.out.println();
    }

    public void printMenu2(){
        for (Item v : menu.values()){
            System.out.println("value = " + v);
        }
        System.out.println();
    }

    public void printMenu3(String s) {
        for (String n : menu.keySet()) {
            if (n.compareTo(s) == 0) { //比較 key值是否相等，0=相等，1以上= 較大，-1以下=較小
                System.out.println(menu.get(n));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        McDonalds mcDonalds = new McDonalds();
        mcDonalds.printMenu();
        mcDonalds.printMenu2();
        mcDonalds.printMenu3("203");
    }
}

class Item {
    String id;
    String name;
    int calorie;
    int price;

    @Override
    public String toString() {
        return name + "\t" + calorie + "\t" + price;
    }


    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

}
