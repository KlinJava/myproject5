package com.hank.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student.test();
        Student stu = new Student("Hank",97,10);
        Student stu2 = new Student("Eric",60,40 );
        Student stu3 = new Student("Jane",30,55);
        GraduateStudent gstu = new GraduateStudent("Jack",55,66,60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student's name :");
        String name = scanner.next();
        System.out.print("Please enter student's english :");
        int english = scanner.nextInt();
        System.out.print("Please enter stucdent's math :");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("High score: " + stu.highest());
        System.out.println("High score2: " + stu.highest2());
        System.out.println("High score3: " + stu.highest3());
    }
}
