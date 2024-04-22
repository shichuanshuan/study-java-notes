package com.poly_detail_5;

public class PolyDetail03 {
    public static void main(String[] args) {
        // instanceOf 比较操作符，用于判断对象的类型是否为 XX 类型或 XX 类的的子类型
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        // aa 编译类型 AA， 运行类型是 BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
    }
}

class AA {

}

class BB extends AA {

}
