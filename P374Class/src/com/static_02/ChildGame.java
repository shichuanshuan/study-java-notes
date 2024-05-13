package com.static_02;

public class ChildGame {
    public static void main(String[] args) {

        Child child = new Child("白骨精");
        child.join();
        Child.count++;

        Child child1 = new Child("狐狸精");
        child1.join();
        Child.count++;

        Child child2 = new Child("老鼠精");
        child2.join();
        Child.count++;

        // 类变量，可以通过类名来访问
        System.out.println("共有 " + Child.count + " 小孩加入了游戏...");
    }
}

class Child {
    private String name;

    // 定义一个变量 count，是一个类变量 static 静态
    // 该变量最大的特点就是会被 child 类的所有的对象
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏...");
    }
}
