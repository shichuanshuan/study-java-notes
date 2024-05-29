package com.testTemplate2;

public class BB extends Template{


    // 计算任务
    public void job() {
        long num = 0;

        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }
}