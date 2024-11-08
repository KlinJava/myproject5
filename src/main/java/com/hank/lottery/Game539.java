package com.hank.lottery;

public class Game539 extends NumberGame{
    int numberCount = 5;

    @Override
    public void generate() {
        super.numberCount = numberCount;
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        System.out.println("樂透539 : set長度 " + numbers.size());
        System.out.println("需求長度是 " + numberCount +"：" + validate());
    }
}
