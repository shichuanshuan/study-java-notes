public class IntDetail {
	public static void main(String[] args) {
		// java 的整数常量（具体值）默认为 int 类型，声明 long 型常量须后加 'l' 或 'L'
		int n1 = 1;  // 4 个字节

		// int n2 = 1L; // 对不对？ 不对

		long n3 = 1L; // 对
	}
}

// java 不会因为操作系统的变化而导致类型占用的字节变化