package com.shics.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        // 1. num1 / num2 => 10 / 0
        // 2. 当执行到 num1 / num2 因为 num2 = 0，程序就会出现异常
//        int res = num1 / num2;

        // 将该代码块-> 选中 -> 快捷键 ctrl + alt + t 选择 try-catch
        try {
            int res = num1 / num2;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行...");
    }
}