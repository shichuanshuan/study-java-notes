package com.string_exercise;

public class StringExercise01 {
    public static void main(String[] args) {
        String a = "shics";
        String b = new String("shics");

        System.out.println(a.equals(b));
        System.out.println(a == b);

        // intern 方法最终返回的常量池的地址
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());
    }
}
