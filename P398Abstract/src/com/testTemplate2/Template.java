package com.testTemplate2;

// 抽象模板模式
abstract public class Template {
    public abstract void job(); // 抽象方法

    public void calculateTime() {
        // 得到开始时间
        long start = System.currentTimeMillis();
        job();

        // 得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间 " + (end - start));
    }
}
