public class SwitchDetail {
	public static void main(String[] args) {
		// 细节1
		// 表达式数据类型应和 case 后的常量类型一致
		// 或者是可以自动转换成可以相互比较的类型，比如输入的是字符，而常量是 int
		char c = 'a';
		switch(c) {
		case 'a':
			System.out.println("ok1");
			break;
		case 'b':
			System.out.println("ok2");
			break;
		// case 20:
		// 	System.out.println("ok33");  不允许
		default:
			System.out.println("ok3");
		}
	}
}