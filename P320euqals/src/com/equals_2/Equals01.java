package com.equals_2;

public class Equals01 {
    public static void main(String[] args) {
//        "hello".equals("abc");
        Integer int1 = new Integer(1000);
        Integer int2 = new Integer(1000);
        System.out.println(int1 == int2);
        System.out.println(int1.equals(int2));

        System.out.println("==================");
        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class B {}

class A extends B {}
