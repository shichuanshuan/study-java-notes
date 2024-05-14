package com.static_method.methodDetaild;

public class StaticMethodDetail {
    public static void main(String[] args) {
        // 1. 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法去：
        // 类方法中无 this 的参数，普通方法中隐含着 this 的参数
        // 2. 类方法可以通过类名条用，也可以通过对象名带哦用

        // 3. 普通方法和对象有关，需要通过对象名调用，比如对象名.方法名，不能通过类名调用
        // 非静态方法不能通过类名条用
        // D.say()
    }
}


class D {
    public int n1 = 100;
    public static int n2 = 200;
    public void say() {

    }

    public static void hi() {
        // 4. 类方法中不允许使用和对象有关的关键字
        // 比如：this 和 super。普通方法可以。
        // System.out.println(this.n1);
    }

    // 5. 类方法中，只能访问静态变量或静态方法
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);

        // System.out.println(this.n2); // 不能使用
        hi();
        // say(); 错误
    }

    // 6. 普通方法，即可有访问非静态成员，也可以访问静态成员
    public void ok() {
        // 非静态成员
        System.out.println(n1);
        say();

        // 静态成员
        System.out.println(n2);
        hello();
    }
}