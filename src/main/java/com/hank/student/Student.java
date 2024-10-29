package com.hank.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t" +
               getAverage() + "\t" +
                ((average>=60)? "PASS" : "FAILED") + "\t");
        getGrading(average);
        getGrading2(average);
        getGrading3(average);
        /*if (getAverage() >=60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/
    }

    private static void getGrading(int average) {
        char grading = 'F';
        if (average >= 90 && average <= 100) {
            grading = 'A';
        } else if (average >=80 && average <=89) {
            grading = 'B';
        } else if (average >=70 && average <=79) {
            grading = 'C';
        } else if (average >=60 && average <=69) {
            grading = 'D';
        }
        System.out.print(grading);
    }

    public void getGrading2(int average){
        char grading = 'F';
        if (average >= 90 && average <= 100) {
            grading = 'A';
        } else if (average >=80 && average <=89) {
            grading = 'B';
        } else if (average >=70 && average <=79) {
            grading = 'C';
        } else if (average >=60 && average <=69) {
            grading = 'D';
        }
        System.out.print(grading);
    }

    public void getGrading3(int average){
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading ='C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println(grading);
    }

    public int highest(){
        int max = 0;
        if (english > math) {
            max = english;
        } else {
            max = math;
        }
        return max;
    }
    public int highest2(){
        int max = (english > math)? english : math;
        return max;
    }
    public int highest3(){
        return (english > math)? english : math;
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
