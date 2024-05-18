package com.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 0.7;
    }
}

// 1. 如果我们要求 A 类不能被其他类继承
// 可以使用 final 修饰 A 类
final class A {

}

//class B extends A {}



class C {
    // 2. 如果我们要求 hi 不能被子类重写
    // 可以使用 final 修饰 hi 方法
    public final void hi () {

    }
}

class D extends C {
    public void hi() {
        System.out.println("重写了 C 类的 hi 方法...");
    }
}

class E {
    // 3. 当不希望类的某个属性值被修改，可以用 final 修饰
    public final static double TAX_RATE = 0.08;
}

// 4. 当不希望某个局部变量被修改，可以使用 final 修饰
class F {
    public void cry() {
        final double NUM = 0.01;
        NUM = 0.9;
        System.out.println("NUM= "+NUM);
    }
}