package com.shics.interface_detail01;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        // 细节1 接口不能被实例化
        // IA ia = new IA();
    }
}


interface IA {
    // 细节2 接口中所有的方法是 public 方法，接口中抽象方法，可以不用 abstract 修饰
    void say(); // 修饰符 public protected 默认 private

    void hi();
}

// 细节3 一个普通类实现接口，就必须将该接口的所有方法都实现
// 可以使用快捷键 alt+enter 来解决
class Cat implements IA {
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

// 细节4 抽象类去实现接口时，可以不实现接口的抽象方法
abstract class Tiger implements IA {}