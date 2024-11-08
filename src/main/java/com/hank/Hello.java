package com.hank;


import com.hank.kolin.Student;

public class Hello {
    public static void main(String[] args) {
        Student stu = new Student("ja",66,90);
        stu.highest();
        stu.grading();
//        System.out.println("Hello!");
        String s = "abcde";
//        String s = null;
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
        Person p = new Person("Tom",66.5f,1.7f);
        p.hello();
        System.out.println("bmi = " + p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 'a');

//        dataVariable();

    }

    private static void dataVariable() {
        int age = 19; //32bits
        Integer age2 = 19;
        age2.byteValue();
        System.out.println("中國"+ age2);
        char c = '我'; //16bits
        Character c2 = 'c';
        byte b = 120; //8bits
        float weight = 66.5f; //32bits
        double height = 1.7; //64bits
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";
    }
}
