public class SwitchDetail03 {
	public static void main(String[] args) {
		// ϸ�� 3
		// case �Ӿ��е�ֵ�����ǳ���(1, 'a'), �������Ǳ���

		// ϸ�� 4
		// default �Ӿ��ǿ���ѡ�ģ���û��ƥ��� case ʱ��ִ�� default
		// ���û�� default �Ӿ䣬��û���κγ�������û�����


		// ϸ�� 5
		// break ���������ִ����һ�� case ��֧��ʹ�������� switch ����
		// ���û��д break �����˳��ִ�е� switch ��β��
		char c = 'a';
		switch(c) {
		case 'a':
			System.out.println("ok1");
		
		case 'b':
			System.out.println("ok2");

		default:
			System.out.println("ok3");
		}

	}
}