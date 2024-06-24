package com.shics.override_;

public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("Father fly...");
    }
}

class Son extends Father {
    // 说明
    // 1. @Override 注解放在 fly 方法上，表示子类的 fly 方法时重写了父类的 fly
    // 2. 这里如果没有写 @Overrde 还是重写了父类 fly
    // 3. 如果你写了 @OVerride 注解，编译器就会去检查该方法是否真的重写了父类的方法，
    // 如果确实重写了，则编译通过，如果没有构成重写，则编译错误。
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }

//    @Override
//    public void eat() {
//        System.out.println("eat");
//    }
}
