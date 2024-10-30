package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1; //產生1-10的數字
        System.out.println("secret: " + secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number != secret) {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            if (number < secret){
                System.out.println("Higher");
            } else if (number > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Great,the number is: " + number);
            }
        }

/*        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 3);*/
    }
}
