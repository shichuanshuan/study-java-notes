package com.CodeBlockDetail04;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        // 细节6 创建一个子类对象时（继承关系），他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用顺序如下：
        // 1. 父类的静态代码块和静态属性（优先级一样，按定义顺序执行）
        // 2. 子类的静态代码块和静态属性（优先级一样，按定义顺序执行）
        // 3. 父类的普通代码块和普通属性初始化（优先级一样，按定义顺序执行）
        // 4. 父类的构造方法
        // 5. 子类的普通代码块和普通属性初始化（优先级一样，按定义顺序执行）
        // 6. 子类的构造方法

        // 说明
        // 1. 进行类的加载
        // 2. 创建对象
        B02 b02 = new B02();

    }
}

// 细节7 静态代码只能直接调用静态成员（静态属性和静态方法），普通代码块可以调用任意成员
class C01 {

}

class A02 {
    private static int n1 = getVal01();
    static {
        System.out.println("A02 的一个静态代码块...");
    }

    {
        System.out.println("A02 的一个普通代码块...");
    }

    public int n3 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");

        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");
        return 10;
    }

    public A02() {
        System.out.println("A02 的构造器");
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();
    static {
        System.out.println("B02 的一个静态代码块...");
    }

    public int n5 = getVal04();
    {
        System.out.println("B02 的一个普通代码块...");
    }

    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");
        return 10;
    }

    B02() {
        // 隐藏了
        // super()
        // 普通代码块
        System.out.println("B02 的构造器");
    }

}