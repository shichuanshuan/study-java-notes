public class TernaryOperatorDetail {
	public static void main(String[] args) {
		// ���ʽ1 �ͱ��ʽ2 ҪΪ���Ը������ձ���������
		// ������Զ�ת��/��ǿ��ת��

		int a = 3;
		int b = 8;
		int c = a > b ? (int)1.1 : (int)3.4;
		double d = a > b ? a : b + 3; // ���ԣ����� int -> double
	}
}