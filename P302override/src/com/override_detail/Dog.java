package com.override_detail;

public class Dog extends Animal {

    // 细节1. Dog 的 cry 方法和 Animal 的 cry 定义形式一样（名称、返回类型、参数）
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }

    // 细节2: 子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类。
    // 比如 父类的返回类型是 Object，子类方法返回类型是 String
    public String m1() {
        return null;
    }

    // 细节3: 子类方法不能缩小父类方法的访问权限, 子类可以方法父类的权限
    // public > protected > 默认 > private
    public void eat() {
        return;
    }
    
//    private void eat() {
//        return;
//    }
}
