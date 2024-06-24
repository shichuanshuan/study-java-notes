package com.shics.enum4;

// 演示 Enum 类的各种方法的使用
public class EnumMethod {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        // 输出枚举对象的名字
        System.out.println(autumn.name());

        // ordinal() 输出的是该枚举对象的次序/编号；从 0 开始编号
        // AUTUMN 枚举对象是第三个，因此输出 2
        System.out.println(autumn.ordinal());

        // 含有定义的所有枚举对象
        Season[] values = Season.values();
        for (Season season: values) { // 增强 for 循环
            System.out.println(season);
        }

        // ValueOf: 将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        // 执行流程
        // 1. 根据你输入的 "AUTUMN" 到 Season 的枚举对象去查找
        // 2. 如果找到了，就返回，如果没找到，就报错
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println("autumn1= " + autumn1);

        // compareTo: 比较两个枚举常量，比较的就是编号
        // 1. 就是把 Season.AUTUMN 枚举对象的编号和 Season.SUMMER 枚举对象的编号比较
        // 2. 看看结果
        System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));

    }
}

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