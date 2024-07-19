package com.shics.try_;

public class TryCatchDetail {
    public static void main(String[] args) {

        // 1. 如果发生异常了，则异常发送后面的代码不会执行，直接进入到 catch 块
        // 2. 如果异常没有发生，则顺序执行 try 的代码块，不会进入到 catch
        // 3. 如果希望不管是否发生异常，都执行某段代码（比如关闭连接，释放资源等）则使用 finally
        try {
            String str = "shics";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);

        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally 代码块被执行");
        }

    }
}
