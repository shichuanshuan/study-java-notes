public class MethodDetail02 {
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();
		System.out.println("==================");
		a.m1();
	}
}

class A {
	// 1. ͬһ�����еķ������ã�ֱ�ӵ��ü���
	public void print(int n) {
		System.out.println("print ���������� n= " + n);
	}

	public void sayOk() { // sayOk ���� print
		print(10);
		System.out.println("����ִ��sayOk");
	}

	// 2. �����еķ��� A ����� B �෽������Ҫͨ������������
	public void m1() {
		methodB b = new methodB();
		b.hai();

	}
}

class methodB {
	public void hai() {
		System.out.println("B���е� hai() ������");
	}
}