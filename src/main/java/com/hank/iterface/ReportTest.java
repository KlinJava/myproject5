package com.hank.iterface;

import java.util.ArrayList;
import java.util.List;

public class ReportTest {
    public static void main(String[] args) {
        Report finance = new FinanceReport();
        Report health = new FinanceReport();
        List<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for (Report s : reports){
            s.load();
            s.print();
        }
    }
}
