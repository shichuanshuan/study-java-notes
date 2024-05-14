package com.static_method.method1;

public class StaticMethod {
    public static void main(String[] args) {
        // 创建两个学生对象，交学费
        Stu tom = new Stu("tom");
        tom.payFee(100);
        // 还可以
        // Stu.payFee(100);

        Stu mary = new Stu("mary");
        mary.payFee(200);

        // 输出
        Stu.showFee();

    }
}

class Stu {
    private String name; // 普通成员

    // 定义一个静态变量，来累积学生的学费。
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    // 说明
    // 1. 当方法使用了 static 修饰后，该方法就是静态方法
    // 2. 静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有:" + Stu.fee);
    }
}