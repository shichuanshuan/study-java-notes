public class FloatDetail {
	public static void main(String[] args) {

		// java �ĸ����ͳ���������ֵ��Ĭ��Ϊ double �ͣ����� float �ͳ��������� 'f' �� 'F'
		// float num1 = 1.1;  // �Բ��ԣ�����
		float num2 = 1.1F;    // �Ե�
		double num3 = 1.1;    // ��
		double num4 = 1.1f;   // ��

		// ʮ��������ʽ���磺5.12   512.0f    .215 ��������С���㣩
		double num5 = .123; // �ȼ� 0.123
		System.out.println(num5);

		// ��ѧ��������ʽ���磺5.12e2        5.12E-2
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		// ������ʹ�����壺2.7  �� 8.1 / 3 �Ƚ�
		// ����һ�δ���
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);  // 2.7
		System.out.println(num12);  // �ӽ� 2.7 ��һ��С��, ������ 2.7

		// �õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж�ʱ��ҪС��
		// Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�

		// ��ȷ��д��
		if (Math.abs(num11 - num12) < 0.000001) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���....");
		}
		System.out.println(Math.abs(num11 - num12));
	}
}