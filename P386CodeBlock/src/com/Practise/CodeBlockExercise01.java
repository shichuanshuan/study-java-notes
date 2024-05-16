package com.Practise;

// 下面的代码输出什么
public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total);
    }
}

class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("is static block!");
    }
}