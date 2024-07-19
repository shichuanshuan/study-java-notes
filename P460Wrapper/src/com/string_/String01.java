package com.string_;

public class String01 {
    public static void main(String[] args) {
        // 4. String 类有好呢多构造器，构造器重载
        // 常用的有
        // String s1 = new String();
        // String s2 = new String(String original);
        // String s3 = new String(char[] a);
        // String s4 = new String(char[] a, int stringIndex, int, count);
        // String s5 = new String(byte[] b);

        // 5. String 类实现了接口 Serializable [String 可以串行化：可以在网络传输]
        //                  接口 Comparable [String 对象可以比较大小]
        // 6. String 是 final 类，不能被其他的类继承
        // 7. String 有属性 private final char value[] 用于存放字符串内容
        // 8. 一定要注意：value 是一个 final 类型，不可以修改地址

        String name = "jack";
        name = "tom";

        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', 'm'};
        value[0] = 'H';
//        value = v2;
        System.out.println(value);
    }
}
