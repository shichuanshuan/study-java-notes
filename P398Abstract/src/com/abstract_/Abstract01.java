package com.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 思考：这里 eat 你实现了，其实没有什么意义
    // 即: 父类方法不确定性的问题
    // ====> 考虑将该方法设计为抽象方法
    // ====> 所谓抽象方法就是没有实现的方法
    // ====> 所谓没有实现就是指，没有方法提
    public void eat() {
        System.out.println("这时一个动物，但是不知道吃什么...");
    }

    // ====> 当一个类中存在抽象方法师，需要将该类声明为 abstract 类
    // ====> 一般来说，抽象类会被继承，由其子类来实现抽象方法。
    public abstract void eat1();
}
