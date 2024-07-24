package com.string_exercise;

public class StringExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "shics";
        Person p2 = new Person();
        p2.name = "shics";

        System.out.println(p1.name.equals(p2.name)); // 比较内容 T
        System.out.println(p1.name == p2.name); //
        System.out.println(p1.name == "shics"); //
    }
}

class Person {
    String name;
}