package com.final_detail;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        System.out.println("=========================");

        EE ee = new EE();
        ee.cal();
        System.out.println("=========================");

        System.out.println(Demo.i);
    }
}

// 1. final 修饰的属性在定义时，必须赋初值，并且以后不能在修改，
// 赋值可以在如下位置之一
class AA {
    // 1). 定义时：如 public final double TAX_RATE = 0.08;
    public final double TAX_RATE = 0.08;

    // 2). 在构造器中
    public final double TAX_RATE2;
    public AA(double TAX_RATE2) {
        this.TAX_RATE2 = TAX_RATE2;
    }

    // 3). 在代码块中
    public final double TAX_RATE3;
    {
        TAX_RATE3 = 8.8;
    }
}

// 2. 如果 final 修饰的属性是静态的，则初始化的位置只能是
class BB {
    // 1) 定义时
    public static final double TAX_RATE = 99.9;

    // 2) 在静态代码块中，不能在构造器中赋值
    public static final double TAX_RATE2;
    static {
        TAX_RATE2 = 3.3;
    }
}

// 3. final 类不能继承，但是可以实例化
final class CC {

}

// 4. 如果类不是 final 类，但是含有 final 方法，则该方法虽然不能重写，但是可以被继承
class DD {
    public final void cal() {
        System.out.println("cal() 方法");
    }
}

class EE extends DD {

}

// 5. final 不能修饰构造方法（即构造器）

// 6. final 和 static 往往搭配使用，效率更改，底层编译器边优化处理
class Demo {
    public static final int i = 16;
    static {
        System.out.println("demo static code block");
    }
}