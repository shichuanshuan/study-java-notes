package detail02;

public class Base {
    public Base() { // 无参构造器,若不声明，会被有参构造器覆盖
        System.out.println("父类Base()构造器被调用...");
    }

    public Base(String name, int age) { // 无参构造器
        System.out.println("父类Base(String name, int age)构造器被调用...");
    }

    public Base(String name) { // 无参构造器
        System.out.println("父类Base(String name)构造器被调用...");
    }

}
