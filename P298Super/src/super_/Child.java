package super_;

public class Child extends Father {
    // 访问父类的属性，但不能访问父类的 private 属性。 super.属性名
    public void hi() {
        // super.n4 不能继承
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    // 访问父类的方法，不能访问父类的 private 方法 super.方法名(参数列表);
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        // super.test400(); 不能访问父类
    }

    // 访问父类的构造器：super(参数列表)；只能放在构造器的第一句，只能出现一句
    public Child() {
//        super();
        super("jack");
    }
}
