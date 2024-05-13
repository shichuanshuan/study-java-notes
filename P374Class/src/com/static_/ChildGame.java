package com.static_;

// 当一个小孩加入游戏后 count++ 最后一个 count 就记录有多少小孩玩游戏
public class ChildGame {
    public static void main(String[] args) {
        // 定义一个变量 count，统计有多少小孩加入了游戏
        int count = 0;

        Child child = new Child("白骨精");
        child.join();
        count++;

        Child child1 = new Child("狐狸精");
        child1.join();
        count++;

        Child child2 = new Child("老鼠精");
        child2.join();
        count++;

        System.out.println("共有" + count + " 小孩加入了游戏...");
    }
}

class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏...");
    }
}