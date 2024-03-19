package com.pkg;

import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 在不同包下，可以访问 public 修饰符或方法
        // 但是不能访问 protected，默认，private 修饰符属性或方法
        System.out.println(a.n1);
    }
}
