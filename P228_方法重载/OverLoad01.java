public class OverLoad01 {
	public static void main(String[] args) {
		// java ������ͬһ�����У����ͬ�������Ĵ��ڣ���Ҫ���β��б�һ��
		// �ô�
		// �������������鷳
		// �����˼������鷳

		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println();
		System.out.println(mc.calculate(1.1, 2));
		System.out.println();
		System.out.println(mc.calculate(1, 2.2));
		System.out.println();
		System.out.println(mc.calculate(1, 2, 3));

	}
}

class MyCalculator {
	// ����֮��
	public int calculate(int n1, int n2) {
		System.out.println("����֮��");
		return n1 + n2;
	}

	// һ��������һ�� double �ĺ�
	public double calculate(int n1, double n2) {
		System.out.println("һ��������һ�� double �ĺ�");
		return n1 + n2;
	}

	// һ�� double��һ�� int ��
	public double calculate(double n1, int n2) {
		System.out.println("һ�� double��һ�� int ��");
		return n1 + n2;
	}

	// ���� int �ĺ�
	public int calculate(int n1, int n2, int n3) {
		System.out.println("���� int �ĺ�");
		return n1 + n2 + n3;
	}
}