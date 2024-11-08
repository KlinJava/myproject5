package com.hank.lottery;

public class BigGame extends NumberGame{
    int numberCount = 6;

    @Override
    public void generate() {
        super.numberCount = numberCount;
        numbers.add(99);
        numbers.add(88);
        numbers.add(77);
        numbers.add(66);
        numbers.add(55);
        numbers.add(44);
        System.out.println("大樂透 : set長度： " + numbers.size());
        System.out.println("需求長度是 " + numberCount +"：" + validate());
    }
}
