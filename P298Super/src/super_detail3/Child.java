package super_detail3;

public class Child extends Father {
    public int n1 = 888;

    // 编写测试方法
    public void test() {
        // super 的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用 super 去访问爷爷类的成员。
        // 如果多个基类（上级类）中都有同名的成员，使用 super 访问遵循就近原则

        System.out.println("super.n1= " + super.n1);
    }
}
