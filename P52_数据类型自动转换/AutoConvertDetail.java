// �Զ�ת��ϸ��
public class AutoConvertDetail {
	public static void main(String[] args) {
		// ϸ��1���ж������͵����ݻ������ʱ
		// ϵͳ�����Զ���������������ת�����������������������ͣ�Ȼ���ٽ��м���
		int n1 = 10;
		// float d1 = n1 + 1.1; // ���� n1 + 1.1 ==> ��������� double
		// float d1 = n1 + 1.1f; // ��, n1 + 1.1 => ��������� double
		// double d1 = n1 + 1.1; // �� ���;��� double

		// ϸ��2�������ǰѾ��ȣ�����������������͸�ֵ�����ȣ�������С����������ʱ
		// �ͻᱨ����ֳ�ͻ�����Զ�����ת��
		// int n2 = 1.1; // ���� double -> int

		// ϸ��3��(byte, short) �� char ֮�䲻���໥�Զ�ת��
		// ���Ѿ��������� byte ʱ�����жϸ����Ƿ��� byte ��Χ�ڣ�����ǾͿ���
		byte b1 = 10; // �ԣ� -128-127
		int n2 = 1; // n2 �� int, �����ڴ��з��� 4 ���ֽ�
		// byte b2 = n2; // �� 4 ���ֽڷ���� b2 1�ֽڻ����
		// char c1 = b1; ����ԭ�� byte �����Զ�ת���� char

		// ϸ��4�� byte,short, char �������߿��Լ��㣬�ڼ���ʽ����ת��Ϊ int ����
		byte b2 = 1;
		short s1 = 1;
		// short s2 = b2 + s1; // ��b2 + s1 => int
		int s2 = b2 + s1; // ��

		byte b3 = 2;
		// byte b4 = b2 + b3; // ���� b2 + b3 => int


		// ϸ��5��boolean ����������
		boolean pass = true;
		// int num100 = pass;

		// ϸ��6���Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ ����������������
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double num500 = b4 + s3 + num200 + num300;

	}
}