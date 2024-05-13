package com.static_03;

public class VisitStatic {
    public static void main(String[] args) {
        // 类名.类变量名
        // 说明：类变量是随着类的加载而创建，所有即使没有创建对象实例也可以访问
        System.out.println(A.name);

        // 通过对象名.类变量名
        A a = new A();
        System.out.println(a.name);
    }
}

class A {
    // 类变量
    public static String name = "石大栓";
}
