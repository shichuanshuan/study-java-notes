package com.shics.innerclass6;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 out = new Outer10();
        out.m1();

        // 外部其他类，使用静态内部类
        // 方式1
        // 因为静态内部类，是可以通过类名直接访问
        Outer10.Inner10 inn = new Outer10.Inner10();
        inn.say();

        // 方式2
        // 编写一个方法，可以返回静态内部类
        System.out.println("===============");
        Outer10.Inner10 inn101 = out.getInnert10();
        inn101.say();

        System.out.println("******************");
        Outer10.Inner10 inn_ = Outer10.getInnert10_();
        inn_.say();

    }
}

class Outer10 { // 外部类
    private int n1 = 10;
    private static String name = "李四";
    private static void cry() {}
    // Inner10 就是静态内部类
    // 1. 放在外部类的成员位置
    // 2. 使用 static 修饰
    // 4. 可以添加任何访问修饰符，因为它的地位就是成员
    public static class Inner10 {
        public void say() {
            // 3. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
            System.out.println(name);

            // 静态内部类访问外部类，直接访问所有静态成员
            cry();

            // 7. 如果外部类和静态内部类成员重名时，默认遵循就近原则
            // 如果想访问外部类，则可以使用 (外部类名.成员)
            System.out.println(name + " 外部类的 name=" + Outer10.name);
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInnert10() {
        return new Inner10();
    }

    public static Inner10 getInnert10_() {
        return new Inner10();
    }
}