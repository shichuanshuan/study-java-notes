package com.shics.enum02;

// 自定义枚举
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
    }
}

class Season {
    private String name;
    private String desc;

    // 3. 在 Season 内部，直接创建固定的对象
    // 定义了四个对象
    public static Season SPRING = new Season("春天", "温暖");
    public static Season WINTER = new Season("冬天", "寒冷");
    public static Season SUMMER = new Season("夏天", "炎热");
    public static Season AUTNMN = new Season("秋天", "凉爽");

    // 1. 将构造器私有化
    // 2. 去掉 setXxx 方法，防止属性被修改
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}