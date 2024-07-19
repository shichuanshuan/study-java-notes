package com.shics.try_;

public class TryCatchDetail03 {
    public static void main(String[] args) {

        // 可以进行 try-finally 配合使用，这种用法相当于没有捕获异常，因此程序会直接崩掉。
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);

        }finally {
            System.out.println("执行了 finally...");
        }

        System.out.println("程序继续执行..");
    }
}
