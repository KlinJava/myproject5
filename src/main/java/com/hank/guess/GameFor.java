package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
/*        int sum = 0;
        for (int i=1; i<=3; i++){
            sum += i; // sum = sum + i
        }
        System.out.println(sum);*/
        int secret = new Random().nextInt(10)+1;
        System.out.println("secret: " + secret);
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=4; i++){
            System.out.print("Please enter a number(" + i + "/4):");
            int num = scanner.nextInt();
            System.out.println("第" + i + "次： " + num);
            if (num > secret) {
                System.out.println("Lower");
            } else if (num < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Greate,the number is: " + num);
                break;
            }
        }
        System.out.println("結束");
    }
}
