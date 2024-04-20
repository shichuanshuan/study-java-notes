package com.override_;

public class Dog extends Animal {

    // 1. 因为 Dog 是 Animal 子类
    // 2. Dog 的 cry 方法和 Animal 的 cry 定义形式一样（名称、返回类型、参数）
    // 3. 这时我们就说 Dog 的 cry 方法，重写了 Animal 的 cry 方法
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }
}
