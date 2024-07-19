package com.string_;

public class String02 {
    public static void main(String[] args) {
        // 两种创建 String 对象的区别
        // 方式一
        // 先从常量池查看是否有 “shics“ 数据空间，如果有，直接指向；
        // 如果没有则重新创建，然后指向。s 最终指向的是常量池的空间地址。
        String s = "shics";

        // 方式二
        // 先在堆中创建空间，里面维护了 value 属性，指向常量池的 shics 空间。如果常量池没有 shics，重新创建，如果有，直接通过 value 指向。
        // 最终指向的是堆中的空间地址。
        String string = new String("shics");
    }
}
