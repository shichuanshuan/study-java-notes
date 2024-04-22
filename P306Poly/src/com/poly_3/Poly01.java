package com.poly_3;

public class Poly01 {
    // 编写一个程序，Master 类中有一个 feed（喂食）方法，可以完成主任给动物喂食物的信息。
    // 传统方法实现多态
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("big yello");
        Bone bone = new Bone("gu tou");
        tom.feed(dog, bone);

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("fish");
        System.out.println("=========================");
        tom.feed(cat, fish);
    }
}
