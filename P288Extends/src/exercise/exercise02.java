package exercise;

public class exercise02 {
    public static void main(String[] args) {
        // 会输出什么
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("我是A类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是 B 类的无参构造器");
    }

    public B(String name) {
        System.out.println("我是B类的有参构造器");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是 C 类的无参构造器");
    }

    public C(String name) {
        super("hahah"); // 调用父类的有参构造器
        System.out.println("我是C类的有参构造器");
    }
}
