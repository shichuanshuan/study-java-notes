public class ThisDetail {
	public static void main(String[] args) {
		T t1 = new T();
		t1.f2();
	}
}

class T {
	/* 
	ϸ��4�����ʹ������﷨��this(�����б�)��
	ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������)

	ע��: ���ʹ������﷨��this(�����б�); ������õ�һ�����
	*/

	public T() {
		// ����ȥ���� T(String name, int age)
		this("jack", 100);

		System.out.println("T() ������");
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age) ������");
	}


	// ϸ��3�����ʳ�Ա�������﷨�� this.������(�����б�)
	public void f1() {
		System.out.println("f1() method....");
	}

	public void f2() {
		System.out.println("f2() method...");
		// ���ñ���� f1
		// ��һ�ַ�ʽ
		f1();
		// �ڶ��ַ�ʽ
		this.f1();
	}
}