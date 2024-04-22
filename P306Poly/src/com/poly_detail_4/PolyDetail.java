package com.poly_detail_4;

public class PolyDetail {
    public static void main(String[] args) {
        // 向上转型：父类的引用指向了子类的对象
        // 语法：父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();
        // Object obj = new Cat(); 可以吗？ 可以 object 也是 Cat 的父类

        // (1) 可以调用父类中的所有成员(需遵守访问权限)
        // (2) 但是不能调用子类的特有的成员
        // (#) 因为在编译阶段，能调用哪里成员，是由编译类型来决定的
        // animal.catchMoust();

        // (4) 最终运行效果看子类(运行类型)的具体实现,即调用方法时，按照从子类开始查找方法，然后调用
        animal.eat(); // 猫吃鱼
        animal.run();
        animal.show();
        animal.sleep();

        System.out.println("===============================");
        // 希望可以调用 Cat 的 catchMouse 方法
        // 多态的向下转型
        // (1) 语法：子类类型 引用名 = (子类类型) 父类引用;
        // 问一个问题？cat 的编译类型 Cat，运行类型也是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse(); // 猫抓老鼠
        // (2) 要求父类的引用必须指向的是当前目标类型的对象
        // Dog dog = (Dog) animal; 不可以，因为 animal 定义的时候是 Cat，不能再变成 Dog
    }
}
