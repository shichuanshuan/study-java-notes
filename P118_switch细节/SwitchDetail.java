public class SwitchDetail {
	public static void main(String[] args) {
		// ϸ��1
		// ���ʽ��������Ӧ�� case ��ĳ�������һ��
		// �����ǿ����Զ�ת���ɿ����໥�Ƚϵ����ͣ�������������ַ����������� int
		char c = 'a';
		switch(c) {
		case 'a':
			System.out.println("ok1");
			break;
		case 'b':
			System.out.println("ok2");
			break;
		// case 20:
		// 	System.out.println("ok33");  ������
		default:
			System.out.println("ok3");
		}
	}
}