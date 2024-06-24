package com.shics.deprecated_;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

// 1. @Deprecated 修饰某个元素，表示该元素已经过时
// 2. 即不在推荐使用，但是仍然可以使用
@Deprecated
class A {
    public int n1 = 10;

    @Deprecated
    public void hi() {

    }
}
