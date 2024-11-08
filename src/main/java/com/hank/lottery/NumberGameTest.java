package com.hank.lottery;

import java.util.ArrayList;
import java.util.List;

public class NumberGameTest {
    public static void main(String[] args) {
        NumberGame ng = new Game539();
        NumberGame ng2 = new BigGame();
        List<NumberGame> ls = new ArrayList<NumberGame>();
        ls.add(ng);
        ls.add(ng2);
        for (NumberGame n : ls) {
            n.generate();
        }
    }
}
