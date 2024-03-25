package theory;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        // 1. 首先看子类是否有该属性
        // 2. 如果子类有这个属性，并且可以访问，则返回信息
        // 3. 如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，就返回信息）
        // 4. 如果父类没有就按照(3)的规则，继续找上级父类，直到 Object...
        System.out.println(son.name);
        // System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅行";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 33;
}

class Son extends Father {
    String name = "大头儿子";
}
