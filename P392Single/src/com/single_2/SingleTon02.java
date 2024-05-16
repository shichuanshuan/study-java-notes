package com.single_2;

public class SingleTon02 {
    public static void main(String[] args) {
        // System.out.println(Cat.n1);

        Cat instance = Cat.getInstance();
        System.out.println(instance);

        // 再次调用 getInstance
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        System.out.println(instance == instance1);
    }
}

// 希望在程序运行过程中，只能创建一个 Cat 对象
// 使用懒汉式单例模式
class Cat {

    private String name;
    public static int n1 = 999;
    private static Cat cat;

    // 步骤
    // 1. 仍然构造器初始化
    // 2. 定义一个 static 静态属性对象
    // 3. 提供一个 public 的static方法，可以返回一个 Cat 对象
    // 4. 懒汉式，只有当用户使用 getInstance 时，才返回 Cat 对象，后面再次调用时，会返回上次创建的 Cat 对象
    // 后面保证了单例
    private Cat(String name) {
        System.out.println("构造器调用...");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }

        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
