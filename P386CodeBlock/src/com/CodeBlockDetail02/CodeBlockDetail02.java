package com.CodeBlockDetail02;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        // 细节3 调用静态代码块和静态属性初始化时，静态代码块和静态属性初始化调用的优先级一样，
        // 如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用.
        A a = new A();
        System.out.println("===============");

        // 细节4 调用普通代码块和普通属性的初始化（普通代码块和普通属性初始化调用的优先级一样，
        // 如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用）
        B b = new B();

        // 细节5 调用构造方法的优先级最低
    }
}

class A {
    // 静态属性初始化
    private static int n1 = getN1();

    // 静态代码块
    static {
        System.out.println("A 的静态代码1被执行...");
    }

    public static int getN1() {
        System.out.println("getN1 被执行...");
        return 100;
    }
}

class B {
    private int n2 = getN2();

    {
        System.out.println("B 被执行...");
    }

    public int getN2() {
        System.out.println("getN2 被执行...");
        return 100;
    }
}