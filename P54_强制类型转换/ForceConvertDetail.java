public class ForceConvertDetail {
	public static void main(String[] args) {
		// 强制符号只针对最近的操作时有效，往往会使用小括号提升优先级
		// int x = (int)30 * 3.5 + 6 * 1.5; // 编译错误：double -> int
		int x = (int)(30 * 3.5 + 6 * 1.5);
		System.out.println(x);

		char c1 = 100;
		int m = 100;
		// char c3 = m; // 错误
		char c3 = (char)m;
		System.out.println(c3);
	}
}