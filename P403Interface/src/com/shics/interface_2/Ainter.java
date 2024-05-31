package com.shics.interface_2;

public interface Ainter {
    // 写属性
    public int n1 = 10;

    // 写方法
    //在接口中，方法必须要是抽象的，接口中方法可以省略 abstract 关键字
    public void hi(); // public abstract void hi();

    // 在 jbk8 后，可以有默认实现方法，必须要在方法名前加 default 修饰
    default public void ok() {
        System.out.println("ok....");
    }

    // 在 jbk8 后，可以有静态方法
    public static void cry() {
        System.out.println("cry...");
    }
}
