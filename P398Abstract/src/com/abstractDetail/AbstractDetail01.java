package com.abstractDetail;

public class AbstractDetail01 {
    public static void main(String[] args) {
        // 细节1 抽象类不能被实例化
        // A a = new A();
    }
}


abstract class A {
}

// 细节2 抽象类不一定要包含 abstract 方法。也就是说，抽象类可以没有 abstract 方法
// 还可以有实现方法
abstract class B {
    public void hi() {
        System.out.println("hi");
    }
}

// 细节3 一旦类包含了 abstract 方法，则这个类必须声明为 abstract
abstract class C {
    public abstract void hi();
}

// 细节4 abstract 只能修饰类和方法，不能修饰属性和其他的
class D {
    // public abstract int n1 = 1;
}