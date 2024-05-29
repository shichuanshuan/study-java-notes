package com.testTemplate;

public class BB {
    public void calculateTime() {
        // 得到开始时间
        long start = System.currentTimeMillis();
        job();

        // 得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("BB 执行时间 " + (end - start));
    }

    // 计算任务
    public void job() {

        // 得到开始的时间
        long start = System.currentTimeMillis();
        long num = 0;

        for (int i = 0; i < 800000; i++) {
            num += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("BB 执行时间 " + (end - start));

    }
}
