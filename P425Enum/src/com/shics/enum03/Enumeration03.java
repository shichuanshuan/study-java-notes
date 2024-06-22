package com.shics.enum03;

// 使用关键字实现枚举
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
    }
}

// 演示使用 enum 关键字来实现枚举
enum Season {
    // 1. 使用关键字 enum 替代 class
    // 2. 直接使用 SPRING("春天", "温暖"),解读 常量名(实参列表). 不用public static Season SPRING = new Season("春天", "温暖");
    // 3. 如果有多个常量(对象)，使用 , 号间隔即可
    // 4. 如果使用 enum 来实现枚举，要求将定义常量对象，写在前面
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热"),

    // 5. 如果我们使用无参构造器，创造常量对象，则可以省略
    WHAT();

    private Season(){}

    private String name;
    private String desc;

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