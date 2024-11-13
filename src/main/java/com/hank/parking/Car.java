package com.hank.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    //建構子：名稱和類別名稱一樣，無回傳值
    public Car(String id, LocalDateTime enter, LocalDateTime leave) {
        this.id = id;
        this.enter = enter;
        this.leave = leave;
    }
    //建構子：名稱和類別名稱一樣，無回傳值
    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public long getDuration() {
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }

    public void leave() {
        //離開時間
        leave = LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave) {
        // 判斷：離場時間要「大於」進場時間
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
