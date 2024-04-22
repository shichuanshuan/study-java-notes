package com.dynamic_6;

// 重要 重要
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B(); // 向上转型
        System.out.println(a.sum()); // 40
        System.out.println(a.sum1()); // 30

        // 动态绑定示例，注释掉 B 中 sum 和 sum1
        System.out.println("");
        Aa aa = new Bb();
        System.out.println(aa.sum()); // 30
        System.out.println(aa.sum1()); // 20
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}

class Aa {
    public int i = 10;

    // 动态绑定机制，把子类 B 的 sum 方法注释掉
    // 1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    // 2. 当调用对象属性时，没有动态绑定机制，哪里声明，那里使用。
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class Bb extends Aa {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}