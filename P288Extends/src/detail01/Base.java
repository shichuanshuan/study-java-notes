package detail01;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() { // 无参构造器
        System.out.println("Base()...");
    }

    public void test100() {
        System.out.println("test100");
    }

    protected  void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public int getN4() {
        return n4;
    }
}
