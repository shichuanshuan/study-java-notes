package com.shics.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }

    // 1. 这里的异常是一个 FileFoundException 编译异常
    // 2. 使用前面讲过的 try-catch-finally
    // 3. 使用 throws，抛出异常，让调用 f2 方法的调用者处理
    public void f2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://a.txt");
    }
}
