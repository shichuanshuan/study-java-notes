public class ForceConvertDetail {
	public static void main(String[] args) {
		// ǿ�Ʒ���ֻ�������Ĳ���ʱ��Ч��������ʹ��С�����������ȼ�
		// int x = (int)30 * 3.5 + 6 * 1.5; // �������double -> int
		int x = (int)(30 * 3.5 + 6 * 1.5);
		System.out.println(x);

		char c1 = 100;
		int m = 100;
		// char c3 = m; // ����
		char c3 = (char)m;
		System.out.println(c3);
	}
}