public class SwitchDetail02 {
	public static void main(String[] args) {
		// ϸ�� 2
		// switch(���ʽ)�б��ʽ�ķ���ֵ�����ǣ�
		// (byte, short, int, char, enum, String)
		char c = 'a';
		switch(c) {
		case 'a':
			System.out.println("ok1");
			break;
		case 'b':
			System.out.println("ok2");
			break;
		default:
			System.out.println("ok3");
		}

		// ������
		// double c2 = 1.1;
		// switch (c2) {
		// 	case 1.1:
		// 		System.out.println("ok1");
		// 		break
		// 	case 2.1:
		// 		System.out.println("ok2");
		// 		break
		// 	default:
		// 		System.out.println("ok3");
		// }
	}
}