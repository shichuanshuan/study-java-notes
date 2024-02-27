public class Method01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(7);

		int res = p1.getSum(3, 7);
		System.out.println("����֮���� " + res);
	}
}

class Person {
	String name;
	int age;

	// ��������Ա������
	// ��� speak ��Ա����
	// 1. public ��ʾ�����ǹ���
	// 2. void ��ʾ����û�з���ֵ
	// 3. speak ������
	// 4. {} �����壬����д����Ҫִ�еĴ���
	// 5. System... ��ʾ���һ�仰
	public void speak() {
		System.out.println("����һ������");
	}

	// ��� cal01 ���������Լ���� 1 + ... 1000 �Ľ��
	public void cal01() {
		int res = 0;
		for (int i = 0; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01 ��������= " + res);
	}

	// ��� cal02 �������÷������Խ���һ���� n������� 1+...+n �Ľ��
	public void cal02(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02 ����������= " + res);
	}

	// ��� getSum ���������Լ����������ĺ�
	public int getSum(int num1, int num2) {
		int res = num1 + num2;

		return res;
	}
}