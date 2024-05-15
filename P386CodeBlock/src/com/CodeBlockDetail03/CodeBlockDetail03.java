package com.CodeBlockDetail03;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        // 细节6 构造器的最前面其实隐含了 super() 和调用普通代码块。
        BBB bbb = new BBB();
    }
}

class AAA {
    {
        System.out.println("AAA的普通代码块");
    }

    public AAA() {
        System.out.println("AAA 的构造器被调用...");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB的普通代码块");
    }

    public BBB() {
        // super
        // 调用本类的普通代码块
        System.out.println("BBB 的构造器被调用...");
    }
}