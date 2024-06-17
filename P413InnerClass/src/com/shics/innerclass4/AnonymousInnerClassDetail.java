package com.shics.innerclass4;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        // 创建一个基于类的匿名内部类
        Person p = new Person() {
            // 5. 遵守就近原则，若想访问外部同名变量，使用 this 修饰
            private int n1 = 33;

            // 4. 不能添加访问修饰符，因为它的地位就是一个局部变量
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法");

                // 3. 可以直接访问外部类的所有成员，包含私有
                System.out.println("n1 = " + n1);
            }
        };
        p.hi(); // 1. 动态绑定，运行类型是 Outer05$1


        // 2. 也可以直接调用,匿名内部类本身也是返回对象
        new Person() {
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法 哈哈");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
    };

}

class Person { // 类
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }
}