package super_detail;

public class Child extends Father {
    public int n1 = 888;
    public void sum() {
        System.out.println("Child sum() method ...");
        // 演示访问方法的规则
        // 希望调用父类 Father 的 cal 方法
        // 这时，因为子类 Child 没有 cal 方法，因此我可以使用下面三种方式

        // 找 cal 方式时，顺序是
        // (1) 先找本类，如果有，则调用
        // (2) 如果没有，则找到父类（如果有，并可以调用，则调用）
        // (3) 如果父类没有，则继续找父类的父类，整个规则，就是一样的，直到 Object 类
        // 提示: 如果查找方法的过程中，找到了，但是不能访问，则报错
        //      如果查找方法的过程中，没有找到，则提示方法不存在
        // cal();
        // this.cal(); 等价 cal()

        // 找 cal 方法的顺序是直接查找父类，其他的规则一样
//        super.cal();

        // 演示访问属性的规则
        // n1 和 this.n1 查找的规则是
        // 先找本类，如果有，则调用
        // 如果没有，则找父类（如果有，并可以调用，则调用）
        // 如果父类没有，则继续找父类的父类，整个规则，就是一样的，直到 Object 类
        System.out.println(n1);
        System.out.println(this.n1);

        // 找n1 (super.n1) 的顺序是直接查找父类，其他的规则一样
        System.out.println(super.n1);
    }
}
