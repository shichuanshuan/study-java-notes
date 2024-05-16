package com.single_1;

import java.util.GregorianCalendar;

public class SingleTon01 {
    public static void main(String[] args) {
        // 1. 通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);

        System.out.println(instance == instance1);

        // 2. 饿汉式，不管有没有用到实例，都会创建实例，显的饥饿
        System.out.println(GirlFriend.n1);
    }
}

// 有一个类，GirlFriend
// 只能有一个女朋友
class GirlFriend {
    private String name;

    public static int n1 = 100;

    // 为了能够在静态方法中，返回 gf 对象，需要将其修饰为 static
    private static GirlFriend gf = new GirlFriend("小红红");

    // 如何保障我们只能创建一个 GirlFriend 对象
    // 步骤[单例模式-饿汉式]
    // 1. 将构造器私有化
    // 2. 在类的内部直接创建
    // 3. 提供一个公共的 static 方法，返回 gf 对象
    private GirlFriend(String name) {
        System.out.println("GirlFriend ....");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}