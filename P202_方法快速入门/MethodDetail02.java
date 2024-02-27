public class MethodDetail02 {
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();
		System.out.println("==================");
		a.m1();
	}
}

class A {
	// 1. 同一个类中的方法调用：直接调用即可
	public void print(int n) {
		System.out.println("print 方法被调用 n= " + n);
	}

	public void sayOk() { // sayOk 调用 print
		print(10);
		System.out.println("继续执行sayOk");
	}

	// 2. 跨类中的方法 A 类调用 B 类方法：需要通过对象名调用
	public void m1() {
		methodB b = new methodB();
		b.hai();

	}
}

class methodB {
	public void hai() {
		System.out.println("B类中的 hai() 被调用");
	}
}