public class MethodDetail01{
	public static void main(String[] args) {
		AA aa = new AA();
		int[] res = aa.getSumAndSub(1, 3);
		System.out.println("Sum= " + res[0]);
		System.out.println("Sub= " + res[1]);
		System.out.println("=========================");

		double val = aa.returnValue();
		System.out.println("val= "+ val);

	}
}

// ��Χ���η������� [public, protected, Ĭ��, private]
class AA {
	// 1. һ�����������һ������ֵ
	public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2];

		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;

		return resArr;
	}

	// 2. �������Ϳ���Ϊ�������ͣ������������ͻ���������(���飬����)
	// �� getSumAndSub

	// 3. �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ return ֵ;
	// ����Ҫ�󷵻�ֵ���ͱ���� return ��ֵ����һ�»����
	public double returnValue() {
		double d1 = 1.1 * 3;
		int n = 100;

		// return n; // int -> double ֧��
		return d1;
	}

	// 4. ��������� void, �򷽷����п���û�� return ��䣬����ֻд return
}