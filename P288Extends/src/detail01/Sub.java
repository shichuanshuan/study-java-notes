package detail01;

public class Sub extends Base {
    public Sub() { // 构造器
        System.out.println("sub()...");
    }

    public void sayOk() {
        // 细节1 非私有的属性和方法可以在子类直接访问
        // 但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + " " + n3);
        test100();
        test200();
        test300();
        // test400();

        // 要通过父类提供公有的方法去访问
        System.out.println("n4= " + getN4());
    }
}
