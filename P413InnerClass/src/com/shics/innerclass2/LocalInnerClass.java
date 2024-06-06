package com.shics.innerclass2;

/*
* 演示局部内部类的使用
* */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outher outher = new Outher();
        outher.m1();
    }
}

class Outher {
    private int n1 = 100;

    private void m2() {} // 私有方法

    public void m1() { // 方法
        // 1. 局部内部类是定义在外部类的局部位置，通常在方法中
        // 3. 不能添加访问修饰符(public、static 等), 但是可以使用 final 修饰
        // 4. 作用域：仅仅在定义它的方法或代码块中
        class Inner { // 局部内部类（本质仍然是一个类）
            // 2. 可以直接访问外部类的所有成员，包含私有的
            private int n1 = 800;
            public void f1() {
                // 5. 局部内部类可以直接访问外部类的成员，比如下面 外部类n1 和 m2()

                // 7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员
                //    使用外部类名.this.成员名 去访问
                // 解读：Outher.this 本质就是外部类的对象，即哪个对象调用 m1， Outer.this 就是哪个对象
                System.out.println("n1= " + n1 + " 外部类的n1= " + Outher.this.n1);
                System.out.println("outer.this hashcode=" + Outher.this);
                m2();
            }
        }
        // 6. 外部类在方法中，可以创建 Inner 对象，然后调用方法即可
        Inner inner = new Inner();
        inner.f1();
    }
}