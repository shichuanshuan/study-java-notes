package com.shics.customexception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;

        // 要求范围在 18 - 120 之间，否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在 18-120 之间");
        }

        System.out.println("你的年龄范围正确");
    }
}

// 自定义异常
// 1. 一般情况下，我要自定义异常是继承 RuntimeException
// 2. 即把自定义异常做成运行时异常，好处是，我们可以使用默认的处理机制。
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
