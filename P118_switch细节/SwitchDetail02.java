public class SwitchDetail02 {
	public static void main(String[] args) {
		// 细节 2
		// switch(表达式)中表达式的返回值必须是：
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

		// 不允许
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