package com.shics.innerclass3;

// 演示匿名内部类的使用
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 { // 外部类
    private int n1 = 10; // 属性
    public void method() { // 方法
        // 基于接口的匿名内部类
        // 1. 需求：想要用 AI 接口，并创建对象
        // 2. 传统方式，是写一个类，实现该接口，并创建对象
//        IA tiger = new Tiger();
//        tiger.cry();

        // 3. 需求是 dog 类只是使用一次，后面不再使用
        // 4. 可以使用匿名内部类来简化开发
        // 5. tiger 的编译类型
        // 6. tiger 的运行类型 就是匿名内部类 XXX = Outer04$1
        /*
        我们看底层
        class XXX implements IA {
        public void cry() {
        System.out.println("老虎叫唤...");
        }
         */

        // 7. jdk 底层在创建匿名内部类 Outer04$1, 立即马上就创建了 Outer04$1 实例，
        // 并把地址返回给 tiger
        // 8. 匿名内部类使用一次，就不能再使用了
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();

        // 演示基于类的匿名内部类
        // 1. father 编译类型 Father
        // 2. father 运行类型 Outer04$2
        // 3. 有大括号 {} 就是匿名内部类
        /*
        class Outer04$2 extends Father {
            public void test() {
                System.out.println("匿名内部类重写了 test 方法");
            }
        }
         */
        // 4. 注意(jack) 参数列表会传递给构造器
        Father jack = new Father("jack") {
            public void test() {
                System.out.println("匿名内部类重写了 test 方法");
            }
        };
        System.out.println("father 对象运行类型=" + jack.getClass());
        jack.test();

        // 基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();

    }
}

interface IA { // 接口
    public void cry();
}

class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("老虎叫唤...");
    }
}

class Dog implements IA {
    @Override
    public void cry() {
        System.out.println("小狗叫唤...");
    }
}

class Father {// 类
    public Father(String name){ // 构造器
        System.out.println("接收到name=" + name);
    }

    public void test() {// 方法

    }
}

abstract class Animal { // 抽象类
    abstract void eat();
}