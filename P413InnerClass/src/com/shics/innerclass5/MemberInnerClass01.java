package com.shics.innerclass5;

// 成员内部类
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        // 7. 外部其他类，使用成员内部类的2种方式
        // 第一种方式
        // outer08.new Inner08(); 相当于把 new Inner08() 当作是 outer08 成员
        // 这就是一个语法，不要特别的纠结
        System.out.println("==============1");
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        System.out.println("==============2");
        // 第二种方式 在外部类种，编写一个方法，可以返回 inner08 对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}

class Outer08 { // 外部类
    private int n1 = 10;
    public String name = "张三";

    // 1.注意：成员内部类是定义在外部内的成员位置上
    // 2. 可以添加任意访问修饰符（public、protected、默认、private）,因为它的地位就是一个成员
    class Inner08 { // 成员内部类
        double sar = 11.0;
        public void say() {
            // 4. 成员内部类访问外部类成员，直接访问
            System.out.println("n1 = " + n1 + " name = " + name);
        }
    }

    // 方法，返回一个 inner08 实例
    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    public void t1() {
        // 使用成员内部类
        // 5. 外部类使用内部类，闯将成员内部类对象，然后使用相关的方法
        Inner08 innter08 = new Inner08();
        innter08.say();
        System.out.println("sar =" + innter08.sar);
    }
}