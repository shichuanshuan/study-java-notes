package com.shics.enum01;

public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "寒冷");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");

        // 因为对于季节而已，它的对象是固定的四个，不会有更多
        // 按照这个设计类的思路，不能体现季节是固定的四个对象
        // 因此，这样设计不好
        Season other = new Season("红天", "---");
    }
}

class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
