package com.wrapperExercise01;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // new 表示创建一个对象， == 判断是不是同一个对象
        System.out.println("i= " + i + " j " + j);


        Integer m = 1; // 底层 Integer.valueOf(1)
        Integer n = 1;
        System.out.println(m == n);
        System.out.println("m= " + m + " n " + n);

        // 1. 如果 x 在 low(-128) ~ high(127), 就直接从数组返回
        // 2. 如果不在 -128 ~ 127, 就直接 new Integer(x)
        // 这里主要看 -128 ~ 127 就是直接返回
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
