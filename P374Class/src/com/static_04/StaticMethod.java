package com.static_04;

public class StaticMethod {
    public static void main(String[] args) {
        // 创建 2 个学生对象，交学费
        Stu stu = new Stu("tom");
        stu.payFee(100);

        Stu stu1 = new Stu("mary");
        stu1.payFee(200);

        // 输出当前收到的学费
        Stu.showFee();
    }
}

class Stu {
    private String name; // 普通成员

    // 定义一个静态变量，来积累学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    // 说明
    // 1. 当方式使用了 static 修饰后，该方法就是静态方法
    // 2. 静态方法就可以访问静态熟悉/变量
    public static void payFee(double fee) {
        Stu.fee += fee; // 累积到
    }

    public static void showFee() {
        System.out.println("总学费有:" + Stu.fee);
    }
}
