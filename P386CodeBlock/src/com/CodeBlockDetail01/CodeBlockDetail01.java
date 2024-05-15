package com.CodeBlockDetail01;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        // 细节1：static 代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，
        // 并且只会执行一次。如果是普通代码块，每创建一个对象，就执行。
        Person person = new Person();
        Person person1 = new Person();
        System.out.println("===================");

        // 细节2: 类什么时候被加载 [重要]
        // 2.1 创建对象实例时
        AA aa = new AA();
        System.out.println("==================");

        // 2.2 创建子类对象实例，父类也会被加载
        CC cc = new CC();
        System.out.println("===================");

        // 2.3 使用类的静态成员时（静态属性）
        System.out.println(Cat.n1);
    }
}

class Person {
    static {
        System.out.println("Person 的静态代码1被执行...");
    }
}

class Cat {
    public static int n1 = 999;

    // 静态代码块
    static {
        System.out.println("Cat 的静态代码1被执行...");
    }
}

class AA  {
    static {
        System.out.println("AA 的静态代码1被执行...");
    }
}

class BB {
    static {
        System.out.println("BB 的静态代码1被执行...");
    }
}

class CC extends BB {
    static {
        System.out.println("CC 的静态代码1被执行...");
    }
}