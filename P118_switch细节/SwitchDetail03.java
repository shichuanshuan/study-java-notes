public class SwitchDetail03 {
	public static void main(String[] args) {
		// 细节 3
		// case 子句中的值必须是常量(1, 'a'), 而不能是变量

		// 细节 4
		// default 子句是可以选的，当没有匹配的 case 时，执行 default
		// 如果没有 default 子句，有没有任何常量，则没有输出


		// 细节 5
		// break 语句用来在执行完一个 case 分支后使程序跳出 switch 语句块
		// 如果没有写 break 程序会顺序执行到 switch 结尾。
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