package com.static_variable.static_detail;

public class StaticDetail {
}

class A {
    // 细节5： 实例变量不能通过 类名.类变量名 方式访问.
    public String name1;

    // 细节6: 类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了
    // 就可以使用类变量了

    // 细节7：类变量的生命周期是随类的加载开始，随着类消亡而销毁
}