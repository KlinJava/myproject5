package com.hank.student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int english, int math, int thesis){
        super(name,english,math);
        this.thesis = thesis;
    }

    @Override //覆寫
    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t" +
                thesis + "\t" + getAverage() + "\t" +
                ((average >= pass)? "PASS" : "FAILED") + "\t");
        getGrading(average);
        getGrading2(average);
        getGrading3(average);
    }
}
