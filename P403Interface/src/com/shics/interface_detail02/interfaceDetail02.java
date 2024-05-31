package com.shics.interface_detail02;

public class interfaceDetail02 {
    public static void main(String[] args) {
        // 证明 接口中的属性 是 public static final
        System.out.println(IB.n1);
        // IB.n1 = 11; 说明是 final

    }
}

interface IB {
    // 细节7 接口中的属性，只能是 final 的，而且是 public static final 修饰符
    int n1 = 10; // 等价 public static final int n1 = 10；

    void hi();
}

interface IC {
    void say();
}

// 细节5 一个类同时可以实现多个接口
class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}

// 细节8 接口不能继承其他的类，但是可以继续多个别的接口
interface ID extends IB, IC {

}

// 细节9 接口的修饰符 只能是 public 和默认，这点和类的修饰符是一样的
interface IE{}