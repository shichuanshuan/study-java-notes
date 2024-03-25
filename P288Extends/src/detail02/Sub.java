package detail02;

public class Sub extends Base {
    // 细节2 子类必须调用父类的构造器，完成父类的初始化
    public Sub() { // 构造器
        // super(); 默认调用父类的无参构造器
        System.out.println("子类Sub()构造器被调用...");
    }

    // 细节3 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        // 如果父类没有提供无参构造器，则必须在子类的构造中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作
        super("smit", 10);
        System.out.println("子类Sub(String name)构造器被调用...");
    }

    // 细节4 如果希望指定去调用父类的某个构造器，则显式的调用一下:super(参数)
    public Sub(String name, int age) {
        // 如果父类没有提供无参构造器，则必须在子类的构造中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作
        super("Tom");
        System.out.println("子类Sub(String name, int age)构造器被调用...");
    }
}
