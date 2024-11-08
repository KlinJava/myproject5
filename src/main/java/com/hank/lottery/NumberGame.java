package com.hank.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate();
    public boolean validate() {
         return (numbers.size() == numberCount)? true : false;
        }
    }

