package com.opert;

public class Operator {
    public static void main(String[] args) {
        // 1. == 即可有判断基本类型，又可以判断引用类型
        // 2. == 如果判断基本类型，判断的是值是否相等。如：int i = 10; double d = 10.0
        // 3. == 如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("================");
        B bObj = a;
        System.out.println(bObj == c);
    }
}

class B {

}

class A extends B {

}

